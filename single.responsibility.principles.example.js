function Square(length) {
    this.length = length;
}

function Circle(radius) {
    this.radius = radius;
}

function Caculator(shapes) {
    this.shapes = shapes;
}

Caculator.prototype.sum = function () {
    areas = [];
    
    shapes.forEach((shape) => {        
        if ( shape instanceof Square) {
            areas.push(Math.pow(shape.length, 2))
        } else if (shape instanceof Circle) {
            areas.push(Math.PI*Math.pow(shape.radius, 2))
        }
    });
    
    let sum = 0.0
    sum = areas.reduce((a,b) => a + b, 0);
    
    return sum;
}

let shapes = [new Circle(2), new Square(5), new Square(6)];
console.log(shapes);

let areas = new Caculator(shapes);
console.log(areas);

console.log("this is the sum():" + areas.sum());
