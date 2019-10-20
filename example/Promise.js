function salam1(name){
    return new Promise((resolve, reject) => {
        setTimeout(()=>{console.log("Halo"+name)
            resolve()
        },3000)})
}
function salam2(name){
    return new Promise((resolve, reject) => {setTimeout(()=>{console.log("Halo"+name)
        resolve()
    },2000)})
}
function salam3(name){
    return new Promise((resolve, reject) => {setTimeout(()=>{console.log("Halo"+name)
        resolve()
    },500)})
}
function prinAll() {
    salam1("Adrika")
        .then(()=>{salam2("Dedy")})
        .then(()=>{salam3("Wahyu")})
}
prinAll()