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
      
        console.log(shape)
        
        if ( shape instanceof Square) {
            console.log('Square');
        } else if (shape instanceof Circle) {
            console.log('Circle');
        }
    });
    
    let sum = 0.0
    
    return sum;
}

let shapes = [new Circle(2), new Square(5), new Square(5)];
console.log(shapes);

let areas = new Caculator(shapes);
console.log(areas);

console.log("this is the sum():" + areas.sum());
