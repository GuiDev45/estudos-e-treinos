/*
34) Construa uma função que receberá duas Strings de tamanhos variados e que retornará True ou False caso
todos os caracteres (independentemente de ser maiúsculo ou minúsculo) estejam contidos em ambas palavras.
*/

function containsSameChars(str1, str2) {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    for (let char of str1) {
        if (!str2.includes(char)) {
            return false;
        }
    }
    return true;
}

console.log(containsSameChars('abcdf', 'cdab'))