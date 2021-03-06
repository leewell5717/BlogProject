package com.test.design.mode.use

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.test.design.mode.use.flyweight_mode.FlyweightModeActivity
import com.test.design.mode.use.abstract_factory_mode.AbstractFactoryActivity
import com.test.design.mode.use.adapter_mode.AdapterModeActivity
import com.test.design.mode.use.bridge_mode.BridgeModeActivity
import com.test.design.mode.use.builder_mode.BuilderModeActivity
import com.test.design.mode.use.chain_of_responsibility_mode.ChainOfResponsibilityModeActivity
import com.test.design.mode.use.command_mode.CommandModeActivity
import com.test.design.mode.use.decorator_mode.DecoratorModeActivity
import com.test.design.mode.use.facade_mode.FacadeModeActivity
import com.test.design.mode.use.factory_method_mode.FactoryMethodModeActivity
import com.test.design.mode.use.interpreter_mode.InterpreterModeActivity
import com.test.design.mode.use.iterator_mode.IteratorModeActivity
import com.test.design.mode.use.mediator_mode.MediatorModeActivity
import com.test.design.mode.use.memorandum_mode.MemorandumModeActivity
import com.test.design.mode.use.observer_mode.ObserverModeActivity
import com.test.design.mode.use.prototype_mode.PrototypeModeKotlinActivity
import com.test.design.mode.use.proxy_mode.ProxyModeActivity
import com.test.design.mode.use.singleton_mode.SingletonModeActivity
import com.test.design.mode.use.state_mode.StateModeActivity
import com.test.design.mode.use.strategy_mode.StrategyModeActivity
import com.test.design.mode.use.template_method_mode.TemplateMethodModeActivity
import com.test.design.mode.use.visitor_mode.VisitorModeActivity

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
    private var iteratorMethodModeBtn : Button? = null
    private var commandModeBtn : Button? = null
    private var stateModeBtn : Button? = null
    private var memorandumModeBtn : Button? = null
    private var visitorModeBtn : Button? = null
    private var mediatorModeBtn : Button? = null
    private var interpreterModeBtn : Button? = null
    private var proxyModeBtn : Button? = null
    private var decoratorModeBtn : Button? = null
    private var adapterModeBtn : Button? = null
    private var facadeModeBtn : Button? = null
    private var flyweightModeBtn : Button? = null
    private var bridgeModeBtn : Button? = null

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
        iteratorMethodModeBtn = findViewById(R.id.iteratorMethodModeBtn)
        iteratorMethodModeBtn?.setOnClickListener(this)
        commandModeBtn = findViewById(R.id.commandModeBtn)
        commandModeBtn?.setOnClickListener(this)
        stateModeBtn = findViewById(R.id.stateModeBtn)
        stateModeBtn?.setOnClickListener(this)
        memorandumModeBtn = findViewById(R.id.memorandumModeBtn)
        memorandumModeBtn?.setOnClickListener(this)
        visitorModeBtn = findViewById(R.id.visitorModeBtn)
        visitorModeBtn?.setOnClickListener(this)
        mediatorModeBtn = findViewById(R.id.mediatorModeBtn)
        mediatorModeBtn?.setOnClickListener(this)
        interpreterModeBtn = findViewById(R.id.interpreterModeBtn)
        interpreterModeBtn?.setOnClickListener(this)
        proxyModeBtn = findViewById(R.id.proxyModeBtn)
        proxyModeBtn?.setOnClickListener(this)
        decoratorModeBtn = findViewById(R.id.decoratorModeBtn)
        decoratorModeBtn?.setOnClickListener(this)
        adapterModeBtn = findViewById(R.id.adapterModeBtn)
        adapterModeBtn?.setOnClickListener(this)
        facadeModeBtn = findViewById(R.id.facadeModeBtn)
        facadeModeBtn?.setOnClickListener(this)
        flyweightModeBtn = findViewById(R.id.flyweightModeBtn)
        flyweightModeBtn?.setOnClickListener(this)
        bridgeModeBtn = findViewById(R.id.bridgeModeBtn)
        bridgeModeBtn?.setOnClickListener(this)
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
                Intent(this, TemplateMethodModeActivity::class.java)
            }iteratorMethodModeBtn -> {
                Intent(this, IteratorModeActivity::class.java)
            }commandModeBtn -> {
                Intent(this, CommandModeActivity::class.java)
            }stateModeBtn -> {
                Intent(this, StateModeActivity::class.java)
            }memorandumModeBtn -> {
                Intent(this, MemorandumModeActivity::class.java)
            }visitorModeBtn -> {
                Intent(this, VisitorModeActivity::class.java)
            }mediatorModeBtn -> {
                Intent(this, MediatorModeActivity::class.java)
            }interpreterModeBtn -> {
                Intent(this, InterpreterModeActivity::class.java)
            }proxyModeBtn -> {
                Intent(this, ProxyModeActivity::class.java)
            }decoratorModeBtn -> {
                Intent(this, DecoratorModeActivity::class.java)
            }adapterModeBtn -> {
                Intent(this, AdapterModeActivity::class.java)
            }facadeModeBtn -> {
                Intent(this, FacadeModeActivity::class.java)
            }flyweightModeBtn -> {
                Intent(this, FlyweightModeActivity::class.java)
            }bridgeModeBtn -> {
                Intent(this, BridgeModeActivity::class.java)
            }else -> {
                Intent(this, MainActivity::class.java)
            }
        }
        startActivity(myIntent)
    }
}