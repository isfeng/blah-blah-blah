var Circle = new Class({

    Implements: [Options, Events],

    options: {
        x: 0,
        y: 0,
        ax: 0,
        ay: 0,
        vx: 0,
        vy: 0,
        color: 'gray',
        radius: 30,
        vr: Math.PI*2/48,
        easing: 0.05
    },

    initialize: function(stage, options) {
        this.setOptions(options);
        this.stage = stage;
        this.shape = new createjs.Shape();
        this.cosvr = Math.cos(this.options.vr);
        this.sinvr = Math.sin(this.options.vr);
    },

    draw: function() {
        var shape = this.shape;      
        shape.graphics.beginStroke(this.options.color).drawCircle(this.options.x, this.options.y, this.options.radius);
        shape.x = this.options.x;
        shape.y = this.options.y;
        shape.regX = shape.x;
        shape.regY = shape.y;
        this.stage.addChild(shape);
    },

    moveTo: function(x, y){
        this.shape.x = x;
        this.shape.y = y;
    },

    arround: function(x, y){
        var dx = x-this.shape.x;   
        var dy = y-this.shape.y;
        if(Math.sqrt(dx*dx+dy*dy)>100) {
            this.shape.x += dx * this.options.easing;
            this.shape.y += dy * this.options.easing;
        }else if(Math.sqrt(dx*dx+dy*dy)<95) {
            this.shape.x -= dx * this.options.easing;
            this.shape.y -= dy * this.options.easing;
        }           
        var x1 = this.shape.x - x;
        var y1 = this.shape.y - y;
        var x2 = x1*this.cosvr-y1*this.sinvr;
        var y2 = y1*this.cosvr+x1*this.sinvr;
        this.shape.x = x + x2;
        this.shape.y = y + y2;
    }

});