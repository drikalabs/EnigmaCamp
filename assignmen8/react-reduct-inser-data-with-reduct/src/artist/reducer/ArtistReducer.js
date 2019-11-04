const initialState = {
    fetchResult: [],
    dataArtist: {artistName: "", bornPlace: "", gender: "", debuteDate: "", songList: []}
}
export default function artistReducer(state = initialState, action) {
    console.log(state, action)
    switch (action.type) {
        case 'FETCHING_SUCCESS':
            return {...state, fetchResult: action.payload};
        case 'HANDLE_INPUT_NAME':
            return {...state, dataArtist: {...state.dataArtist, artistName: action.payload}};
        case 'HANDLE_INPUT_BPLACE':
            return {...state, dataArtist: {...state.dataArtist, bornPlace: action.payload}};
        case 'HANDLE_INPUT_GENDER':
            return {...state, dataArtist: {...state.dataArtist, gender: action.payload}};
        case 'HANDLE_INPUT_DDATE':
            return {...state, dataArtist: {...state.dataArtist, debuteDate: action.payload}};
        case 'ADD_SONG':
            return {
                ...state, dataArtist:
                    {
                        ...state.dataArtist,
                        songList: state.dataArtist.songList.concat([{titleSong: '', releaseDate: ''}])
                    }
            }
        case 'HANDLE_TITLE_SONG':
            return {
                ...state, dataArtist: {
                    ...state.dataArtist, songList: state.dataArtist.songList.map((element, index) => {
                        if (index === action.index){
                            return {...element,titleSong:action.payload}
                        }else {
                            return {...element}
                        }
                    })
                }
            }
        case 'HANDLE_RELEASE_DATE':
            return {
                ...state, dataArtist: {
                    ...state.dataArtist, songList: state.dataArtist.songList.map((element, index) => {
                        if (index === action.index){
                            return {...element,releaseDate:action.payload}
                        }else {
                            return {...element}
                        }
                    })
                }
            }
        default:
            return state
    }
}