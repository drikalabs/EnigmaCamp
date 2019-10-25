import React from 'react';
import {shallow} from "enzyme";
import App from './App';

describe('APP Component', () => {
    const appContainer = shallow(<App/>)
    describe('render', () => {

        it('should contains one div', () => {
            expect(appContainer.find('div')).toHaveLength(1)
        });
        it('should have one Header as a child to div ',  ()=> {
            expect(appContainer.find('div').children('header')).toHaveLength(1)
        });
        it('should contains one Input',  ()=> {
            expect(appContainer.find('input')).toHaveLength(1)
        });
        it('should have one button',  ()=> {
            expect(appContainer.find('button')).toHaveLength(1)
        });
        it('should button wit label click',  ()=> {
            expect(appContainer.find('button').text()).toBe('click')
        });
    });
    describe('function handler',()=>{
        it('should contains string percobaan when change on perform',  ()=> {
            appContainer.find('input').at(0).simulate("change",{target:{value:'percobaan'}})
            expect(appContainer.find('input').prop('value')).toEqual('percobaan')
        });
    })
});