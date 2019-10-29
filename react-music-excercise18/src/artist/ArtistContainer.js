import React from 'react';
import '../App.css';
import ArtistCard from "./ArtistCard";
import {fetchService, fetchtPagination} from "./ArtistService";
import ArtistForm from "./ArtistForm";

class ArtistContainer extends React.Component{

    constructor(props) {
        super(props);
        this.state ={artist: {
                content: [],
                total: null,
                per_page: null,
                curent_page: 0
            }
        }
    }
    componentDidMount() {
        this.fetcingpagination(0)
    }
    fetcingpagination= async (pageNumber)=>{
        const data =await fetchtPagination(pageNumber);
        console.log(data)
        if (!(data === undefined)){
            this.setState({artist:{content:data.content},
                total:data.totalElements,
                per_page:data.size,
                curent_page:data.number
            })
        }
    }
    render() {
        let artists, renderPageNumbers;
        if (this.state.artist.content !== null) {
            artists = this.state.artist.content.map(artist => {
                return <ArtistCard className="card" data={artist}/>
            });
        }
        const pageNumbers = [];
        if (this.state.total !== null) {
            for (let i = 0; i <= Math.ceil(this.state.total / this.state.per_page -1); i++) {
                pageNumbers.push(i);
            }
            renderPageNumbers = pageNumbers.map(numbers => {
                let classes = this.state.current_page === numbers ? 'active' : '';
                return (
                    <span key={numbers} className={classes}
                          onClick={() => this.fetcingpagination(numbers)}>{numbers+1}</span>
                );
            });
        }
        return (
            <div className="content">
                <ArtistForm/>
                {artists}
                <div className='pagination'>
                    <span onClick={() => this.fetcingpagination(0)}>&laquo;</span>
                    {renderPageNumbers}
                    <span onClick={() => this.fetcingpagination(0)}>&raquo;</span>

                </div>
            </div>
        );
    }

}

export default ArtistContainer;
