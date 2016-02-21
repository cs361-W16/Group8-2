/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import models.Game;
import models.Spanish_Game;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;


@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html();
    }

    public Result acesUp() {
        return Results.html().template("views/AcesUp/Welcome.flt.html");
    }
	
	public Result english() {
        return Results.html().template("views/AcesUp/English/AcesUp.flt.html");
    }
	
	public Result spanish() {
        return Results.html().template("views/AcesUp/Spanish/AcesUp.flt.html");
    }
	
	public Result sidebar() {
        return Results.html().template("views/layout/Sidebar.html");
    }
	
	public Result header() {
        return Results.html().template("views/layout/header.ftl.html");
    }
	
	public Result footer() {
        return Results.html().template("views/layout/footer.ftl.html");
    }
	
	//public Result audio() {
    //    return Results.html().template("assets/audio/"); add to shortcuts if audio to be added
    //}
    
    public Result gameGet(){
        Game g = new Game();
        g.buildDeck();
        g.shuffle();
        g.dealFour();

        return Results.json().render(g);
    }

    public Result dealPost(Context context, Game g) {
        if(context.getRequestPath().contains("deal")){
            g.dealFour();
        }
        return Results.json().render(g);
    }

    public Result removeCard(Context context, @PathParam("column") int colNumber, Game g){
        g.remove(colNumber);
        return  Results.json().render(g);
    }

    public Result moveCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, Game g){
        g.move(colFrom-1,colTo-1);
        return  Results.json().render(g);
    }

    // Spanish functions
    public Result s_gameGet(){
        Spanish_Game g = new Spanish_Game();
        g.buildSpanish();
        g.shuffle();
        g.dealFour();

        return Results.json().render(g);
    }

    public Result s_dealPost(Context context, Game g) {
        if(context.getRequestPath().contains("deal")){
            g.dealFour();
        }
        return Results.json().render(g);
    }

    public Result s_removeCard(Context context, @PathParam("column") int colNumber, Game g){
        g.remove(colNumber);
        return  Results.json().render(g);
    }

    public Result s_moveCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, Game g){
        g.move(colFrom-1,colTo-1);
        return  Results.json().render(g);
    }


}
