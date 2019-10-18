function salam1(name){
    setTimeout(()=>{console.log("Halo"+name)},3000)
}
function salam2(name){
    setTimeout(()=>{console.log("Halo"+name)},2000)
}
function salam3(name){
    setTimeout(()=>{console.log("Halo"+name)},500)
}
function cetaksemua() {
    salam1("hai")
    salam2("anjay")
    salam3("kuy")
}
cetaksemua()