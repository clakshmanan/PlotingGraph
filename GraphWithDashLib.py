
import dash
import dash_core_components as dcc
import dash_html_components as html
from dash import html as html

app = dash.Dash()

app.layout = html.Div(children=[html.H1("Dash Tutorials"),
            dcc.Graph(id="Graph Uma Engineering",
            figure={
                "data" : [
                    {"customer_01": [2,4,6,8], "customer_02": [1,3,5,7], "type":"line", "name" : "UmaProgress"},
                    {"customer_01": [11,2,22,4], "customer_02": [21,12,10,17], "type":"pie", "name" : "UmaPending"},
                    ],
                "layout" : { "Title":  "Current year Status"}
            })
])

if __name__ == "__main__":
    app.run_server(debug=True)

# server IP: 127.0.0.8050 
