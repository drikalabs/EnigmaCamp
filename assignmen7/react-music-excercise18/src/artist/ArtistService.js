export  async function fetchService() {
    const data = await  fetch('http://localhost:9009/artist',{method :'GET'})
        .then((resp)=>{console.log(resp)
            return resp.json()})
    return data;
}
export async function Submitdata(artistForm) {
    const data = await fetch('http://localhost:9009/artist',{method:'POST' ,headers:{'Content-Type':'application/json'} ,body:JSON.stringify(artistForm)})
        .then((response)=>{
            console.log(response)
            return response.json()
        }).catch(reason => {
            console.log(reason)
        })
    return data;
}
export  async function fetchtPagination(pageNumber) {
    const data = await  fetch(`http://localhost:9009/artists?size=5&page=${pageNumber}`,{method :'GET'})
        .then((resp)=>{console.log(resp)
            return resp.json()})
    return data;
}

export  async  function submitWithImage(data,file) {
    const formData = new FormData();
    formData.append('data',data);
    formData.append('file',file);
    console.log(formData);
    return await fetch(`http://localhost:9009/saveartist`,{method:'POST',body:formData})
        .then((response)=>{
            return response.json()
            console.log(response);
        })
        .catch(err =>err);

}