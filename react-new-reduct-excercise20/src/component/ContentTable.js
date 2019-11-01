import React from 'react';

class ContentTable extends React.Component {
    render() {
        return (
                <table>
                    <tr>
                        <td>Artist : {this.props.element.artist}</td>
                        <td>Song : {this.props.element.song}</td>
                    </tr>
                </table>
        );
    }
}

export default ContentTable;
