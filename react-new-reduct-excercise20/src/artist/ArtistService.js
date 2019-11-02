export default async function fetchingDatas() {
    const data =await fetch('http://localhost:9009/artist',{method :'GET'})
        .then((resp)=>{console.log(resp)
            return resp.json()})
    return data;
}