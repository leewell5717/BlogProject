package com.test.design.mode.use

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.test.design.mode.use.abstract_factory_mode.AbstractFactoryActivity
import com.test.design.mode.use.builder_mode.BuilderModeActivity
import com.test.design.mode.use.chain_of_responsibility_mode.ChainOfResponsibilityModeActivity
import com.test.design.mode.use.factory_method_mode.FactoryMethodModeActivity
import com.test.design.mode.use.observer_mode.ObserverModeActivity
import com.test.design.mode.use.prototype_mode.PrototypeModeKotlinActivity
import com.test.design.mode.use.singleton_mode.SingletonModeActivity
import com.test.design.mode.use.strategy_mode.StrategyModeActivity
import com.test.design.mode.use.template_method_mode.TemplateMethodMode

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private var singletonModeBtn : Button? = null
    private var builderModeBtn : Button? = null
    private var prototypeModeBtn : Button? = null
    private var factoryMethodModeBtn : Button? = null
    private var abstractFactoryModeBtn : Button? = null
    private var observerModeBtn : Button? = null
    private var strategyModeBtn : Button? = null
    private var chainOfResponsibilityModeBtn : Button? = null
    private var templateMethodModeBtn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        singletonModeBtn = findViewById(R.id.singletonModeBtn)
        singletonModeBtn?.setOnClickListener(this)
        builderModeBtn = findViewById(R.id.builderModeBtn)
        builderModeBtn?.setOnClickListener(this)
        prototypeModeBtn = findViewById(R.id.prototypeModeBtn)
        prototypeModeBtn?.setOnClickListener(this)
        factoryMethodModeBtn = findViewById(R.id.factoryMethodModeBtn)
        factoryMethodModeBtn?.setOnClickListener(this)
        abstractFactoryModeBtn = findViewById(R.id.abstractFactoryModeBtn)
        abstractFactoryModeBtn?.setOnClickListener(this)
        observerModeBtn = findViewById(R.id.observerModeBtn)
        observerModeBtn?.setOnClickListener(this)
        strategyModeBtn = findViewById(R.id.strategyModeBtn)
        strategyModeBtn?.setOnClickListener(this)
        chainOfResponsibilityModeBtn = findViewById(R.id.chainOfResponsibilityModeBtn)
        chainOfResponsibilityModeBtn?.setOnClickListener(this)
        templateMethodModeBtn = findViewById(R.id.templateMethodModeBtn)
        templateMethodModeBtn?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val myIntent = when(v){
            singletonModeBtn -> {
                Intent(this, SingletonModeActivity::class.java)
            }builderModeBtn -> {
                Intent(this, BuilderModeActivity::class.java)
            }prototypeModeBtn -> {
                //这里切换成java的原型模式/kotlin的原型模式
//                Intent(this, PrototypeModeJavaActivity::class.java)
                Intent(this, PrototypeModeKotlinActivity::class.java)
            }factoryMethodModeBtn -> {
                Intent(this, FactoryMethodModeActivity::class.java)
            }abstractFactoryModeBtn -> {
                Intent(this, AbstractFactoryActivity::class.java)
            }observerModeBtn -> {
                Intent(this, ObserverModeActivity::class.java)
            }strategyModeBtn -> {
                Intent(this, StrategyModeActivity::class.java)
            }chainOfResponsibilityModeBtn -> {
                Intent(this, ChainOfResponsibilityModeActivity::class.java)
            }templateMethodModeBtn -> {
                Intent(this, TemplateMethodMode::class.java)
            }else -> {
                Intent(this, MainActivity::class.java)
            }
        }
        startActivity(myIntent)
    }
}