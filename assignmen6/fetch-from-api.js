/*       // percobaan pertama
const url = 'http://localhost:9090/store';

fetch(url).then(respone => respone.json())
    .then((respone) => {
        console.log(respone)
        fetchUserData =  () => {
            document.getElementById('#response').innerHTML = JSON.stringify(respone)
        }
    })*/

// percoban ke dua
document.getElementById('fetchUserData').addEventListener('click', fetchData);

function fetchData(){
    const url ='http://localhost:9090/store';
    fetch(url)
        .then(response => response.json())
        .then(json => {
            let output = '<h2>Lists of Users</h2>';
            output += '<table border="1">';
            json.forEach(function (items) {
                output += `
                            <tr>
                                <td>${items.storeName}</td>
                                <td>${items.address}</td>
                                <td>${items.description}</td>
                                <td>${items.phoneNumber}</td>
                            </tr>
                        `;
            });
            output += '</table>'
            document.getElementById("response").innerHTML = output;
        })

}