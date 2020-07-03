package com.test.design.mode.use.builder_mode

/**
 * 使用组装一台电脑，来说明builder模式
 */
class CreateComputer{

    //主板
    var mBoard : String? = null
    //cpu
    var mCpu : String? = null
    //内存
    var mRam : String? = null
    //显卡
    var mGraphicsCard : String? = null

    private constructor(board : String?,cpu : String?,ram : String?,graphicsCard : String?){
        this.mBoard = board
        this.mCpu = cpu
        this.mRam = ram
        this.mGraphicsCard = graphicsCard
    }

    class Builder{
        private var board : String? = null
        private var cpu : String? = null
        private var ram : String? = null
        private var graphicsCard : String? = null

        fun setBoard(b:String?) : Builder{
            board = b
            return this
        }

        fun setCpu(c:String?) : Builder{
            cpu = c
            return this
        }

        fun setRam(r:String?) : Builder{
            ram = r
            return this
        }

        fun setGraphicsCard(g:String?) : Builder{
            graphicsCard = g
            return this
        }

        fun build() : CreateComputer{
            return CreateComputer(board,cpu,ram,graphicsCard)
        }
    }
}