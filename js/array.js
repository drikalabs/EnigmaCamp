//array in js

a=[1,2,3,4,5,6,7,8]
for (let i = 0; i < a.length; i++) {
    console.log(a[i])
    
}
console.log('=================================')
b=[4,5,6,7,8,9]
console.log(b)
for (let i = 0; i < b.length; i++) {
    b[i] = b[i]+2;
    
}
console.log("after +2 ="+b)
console.log('=================================')
var examplemap= new Map()
// map (key,value)

//example fungsi
function coba(x){
    console.log(x)
}

examplemap.set(1,'angka satu')
examplemap.set('nama','adrika')
examplemap.set('city','Nggalek')
examplemap.set('fungsi',coba)

examplemap.get('fungsi')(examplemap.get('city'))

//looping for map

// key only
for(let key of examplemap.keys()){
    console.log(key)
}
console.log('=================================')
// values only
for(let isi of examplemap.values()){
    console.log(isi)
}
console.log('=================================')
//Set in js
let exampleset = new Set()
exampleset.add(1)
exampleset.add('manusia')
exampleset.add('barang')
exampleset.add(coba)

exampleset.forEach(element => {
    console.log(element)
});
console.log('=================================')


//Object in js
let people ={name:"Adrika",age:30,address:"Jakarta"}
console.log("isi dari object people")
console.log(people)
console.log('=================================')
console.log('ambil keys')
console.log(Object.keys(people))
console.log('=================================')
console.log('berdasarkan values')
console.log(Object.values(people))
console.log('=================================')


//ambil satuan
console.log('Nama : '+people.name)
console.log('Age :'+people.age)
console.log('Address :'+people.address)
console.log('=================================')


// di definisikan sebagai variable dengan syarat nama variable sama dengan nama keys
let{name,age,address}=people
console.log(name)
console.log(age)
console.log(address)
console.log('=================================')


// cara mengisi objek kosong
var exampleObject={name:"",age:null,address:""}
console.log(exampleObject)
console.log()
console.log('setelah di isi')


// cara mengisi
exampleObject.name="Dedy"
exampleObject.age=21
exampleObject.address="lampung"
console.log(exampleObject)
console.log('=================================')


//penggunaan parsing by reference meng copy alamat memory nya
let exampleObject2 =exampleObject
console.log(exampleObject2)
console.log('=================================')


//penggunaan parsing by value menggunakan ...(speate oprator)
let exampleObject3 ={...exampleObject}
console.log(exampleObject3)
console.log('=================================')

// dan bisa menambah value object itu sendiri seperti
let exampleObject4 ={...exampleObject,gender:"male"} //menambahkan key baru setelah koma dan bisa di set value
console.log(exampleObject4)
console.log('=================================')
let exampleObject5={name:"adrika" ,age:19, address:{city:"trenggalek",street:"pogalan",vilage:"ngulanwetan"},gender:"MALE"}
console.log(exampleObject5)

// ambil array dalam objek address
let takeAddres = exampleObject5.address
console.log(takeAddres)

//take data from object array
let takeCity =exampleObject5.address.city
console.log(takeCity)
console.log('=================================')

//take curent date
var date =new Date();
console.log('=================================')

//Object Assign
let exampleObject6 = Object.assign({},exampleObject5)// sama seperti meng copy vale menggunakan speate oprator
console.log(exampleObject6)
console.log('=================================')
console.log('=================================')
console.log('=================================')
console.log('=================================')
console.log('=================================')
console.log('=================================')
console.log('=================================')
console.log('=================================')