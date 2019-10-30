import React from 'react';
import {shallow} from "enzyme";
import App from '../App';

describe('APP Component', () => {
    const appContainer = shallow(<App/>)
    describe('render', () => {

        it('should contains one div', () => {
            expect(appContainer.find('div')).toHaveLength(1)
        });
        it('should have one Navigation',  ()=> {
            expect(appContainer.find('Navigation')).toHaveLength(1)
        });
        it('should have one Switch',  ()=> {
            expect(appContainer.find('Switch')).toHaveLength(1)
        });
        it('should have two Route as child to Switch',  ()=> {
            expect(appContainer.find('Switch').children('Route')).toHaveLength(2)
        });
        it('should have one ArtistContainer as Route as child to Switch',  ()=> {
            expect(appContainer.find('Switch').children('Route').children('ArtistContainer')).toHaveLength(1)
        });
        it('should have one SongContainer as Route as child to Switch',  ()=> {
            expect(appContainer.find('Switch').children('Route').children('SongContainer')).toHaveLength(1)
        });
    });
    // describe('function handler',()=>{
    //     it('should contains string percobaan when change on perform',  ()=> {
    //         appContainer.find('input').at(0).simulate("change",{target:{value:'percobaan'}})
    //         expect(appContainer.find('input').prop('value')).toEqual('percobaan')
    //     });
    // })
});