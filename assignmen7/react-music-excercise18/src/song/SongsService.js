export async function SubmitSong(songForm) {
    const data = await fetch('http://localhost:9009/song',{method:'POST' ,headers:{'Content-Type':'application/json'} ,body:JSON.stringify(songForm)})
        .then((response)=>{
            console.log(response)
            return response.json()
        }).catch(reason => {
            console.log(reason)
        })
    return data;
}
export async function getSongsData() {
    const data = await fetch('http://localhost:9009/song',{method:'GET'})
        .then((response)=>{
            console.log(response)
            return response.json()
        })
    return data;
}