export  async function fetchService() {
    const data = await  fetch('http://localhost:8989/artist',{method :'GET'})
        .then((resp)=>{console.log(resp)
            return resp.json()})
    return data;
}


//fetchService();