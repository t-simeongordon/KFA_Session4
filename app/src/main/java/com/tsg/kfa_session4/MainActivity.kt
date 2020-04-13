package com.tsg.kfa_session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Layout Activity
// CONSTRAINT Layout is similar to auto layout
// three types of constraints - wrap, fixed and matched
// autoconnect - when on automatically provides constraints when you drag and drop elements
//infer constraints - automatically places constraints around all elements on the screen
//set default margin - add required margin space between any item dragged onto the design view
//guidelines - provide guide lines horizontally/vertically - can be used to constrain ui elements to guidelines
// - set by margin - can be set by percentage by clicking the arrow in circle on guideline 3/4 times

//Find resouce in finder - navigste to res/drawable folder - right click - select reveal in finder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
