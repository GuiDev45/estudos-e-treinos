/*
02) Os triângulos podem ser classificados em 3 tipos quanto ao tamanho de seus lados:
Equilátero: Os três lados são iguais. Isósceles: Dois lados iguais. Escaleno: Todos os lados são diferentes.
Crie uma função que recebe os comprimentos dos três lados de um triângulo e retorne sua classificação quanto
ao tamanho de seus lados. (Neste exemplo deve-se abstrair as condições matemáticas de existência de um
triângulo).
*/

const tiposTriangulos = (a, b, c) => {
    //Condição para informar a medida
    if (a < (b + c) && b < (a + c) && c < (a + b)) {
        //Condição para saber o tipo do triângulo
        if (a == b && b == c) {
            console.log('Triângulo equilátero');
        }
        else if (a == b || a == c || c == b) {
            console.log('Triângulo isóceles');
        }
        else {
            console.log('Triângulo escaleno');
        }
    }

    else {
        console.log('Nenhuma medida foi informada!');
    }
}

tiposTriangulos(10, 5, 10)
tiposTriangulos(10, 10, 10)
tiposTriangulos(3, 4, 5)
tiposTriangulos()
