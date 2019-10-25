import React from 'react';
import {shallow} from "enzyme";
import Detail from "../product/Detail";
// masih eror
describe('Detail Components',()=>{
    const appContainer=shallow(<Detail  detail={[]}/>)
    describe('render',()=>{
        it('should have one div', ()=> {
            expect(appContainer.find('div')).toHaveLength(1)
        });
    })
})