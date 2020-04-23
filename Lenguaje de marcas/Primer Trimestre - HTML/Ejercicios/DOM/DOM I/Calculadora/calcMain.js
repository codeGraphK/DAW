/* var written = 0,
    oper = '';
    function operaciones(id) {
        written = parseInt(document.getElementById('result').innerHTML);
        document.getElementById('result').innerHTML = null;
        oper = id;
    }
    
    function resultado(){
        switch(oper) {
            case "multi":
                document.getElementById('result').innerHTML = written*document.getElementById('result').innerHTML;
                break;
            case "divi":
                document.getElementById('result').innerHTML = written/document.getElementById('result').innerHTML;
                break;
            case "suma":
                document.getElementById('result').innerHTML = written+document.getElementById('result').innerHTML;
                break;
            case "resta":
                document.getElementById('result').innerHTML = written-document.getElementById('result').innerHTML;
        }
    } */
var monda = false;

function subir(id) {
    if(monda) {
        document.getElementById('result').innerHTML = null;
    }
    monda = false;
    document.getElementById('result').innerHTML += document.getElementById(id).innerHTML;
}

function subirop(id) {
    document.getElementById('result').innerHTML += document.getElementById(id).innerHTML;
    monda = false;
}

function resultado() {
    document.getElementById('result').innerHTML = eval(document.getElementById('result').innerHTML);
    monda = true;
}

function erase() {
    document.getElementById('result').innerHTML = null;
}