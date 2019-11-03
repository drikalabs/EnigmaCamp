export default async function fetchingDatas() {
    const data =await fetch('http://localhost:9009/artist',{method :'GET'})
        .then((resp)=>{console.log(resp)
            return resp.json()})
    return data;
}
export async function submitData(artistForm) {
    const data = await fetch('http://localhost:9009/artist',{method:'POST' ,headers:{'Content-Type':'application/json'} ,body:JSON.stringify(artistForm)})
        .then((response)=>{
            console.log(response)
            return response.json()
        }).catch(reason => {
            console.log(reason)
        })
    return data;
}