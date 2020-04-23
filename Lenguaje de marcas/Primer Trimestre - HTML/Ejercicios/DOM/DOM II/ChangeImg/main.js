var imgArray = ["primeraImg.png", "segundaImg.png", "terceraImg.png", "cuartaImg.png", "quintaImg.png"];
var num = 0;

function move(Entrada) {
    switch (Entrada) {
        case "1":
            if (num == 0) {
                num = imgArray.length - 1;
            } else {
                num--;
            }
            document.getElementById("changerImg").src = imgArray[num];
            break;
        case "2":
            if (num == (imgArray.length - 1)) {
                num = 0;
            } else {
                num++;
            }
            document.getElementById("changerImg").src = imgArray[num];
            break;
        case "3":
            document.getElementById("changerImg").src = imgArray[imgArray.length - 1];
            break;
        default:
            document.getElementById("changerImg").src = imgArray[0];
            break;
    }
}