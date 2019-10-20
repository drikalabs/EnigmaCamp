console.log("<========================================================================================================================>")

function salam11(name,sebuahFunction){
    setTimeout(()=>{console.log("Halo"+name)
        sebuahFunction()
    },3000)
}
function salam22(name,sebuahFunction){
    setTimeout(()=>{console.log("Halo"+name)
        sebuahFunction()
    },2000)
}
function salam33(name,sebuahFunction){
    setTimeout(()=>{console.log("Halo"+name)
        sebuahFunction()
    },500)
}
function take() {
    salam11("Dedy",()=>{
        salam22("ragil",()=>{
            salam33("rifqi",()=>{})
        })
    })

}
take()