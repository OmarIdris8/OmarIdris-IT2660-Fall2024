const sales = [
    {jan:45.00, feb:50.00, mar:47.00},
    {jan:95.00, feb:73.00, mar:40.00},
    {jan:10.00, feb:32.00, mar:24.00},
    {jan:86.00, feb:74.00, mar:80.00}
];

const nameTotals = [
    {name:"East (Matt)", total : [sales[0].jan + sales[0].feb + sales[0].mar]},
    {name:"West (Mike)", total : [sales[1].jan + sales[1].feb + sales[1].mar]},
    {name:"Westshore (Mark)", total : [sales[2].jan + sales[2].feb + sales[2].mar]},
    {name:"Metro (Milt)", total : [sales[3].jan + sales[3].feb + sales[3].mar]}
];

function salesByPerson() {   

    alert(
        nameTotals[0].name + " : $" + nameTotals[0].total 
        + '\n' +
        nameTotals[1].name + " : $" + nameTotals[1].total  
        + '\n' +
        nameTotals[2].name + " : $" + nameTotals[2].total  
        + '\n' +
        nameTotals[3].name + " : $" + nameTotals[3].total
    );
   
 }
 
 function bestAndWorst() {
    
    nameTotals.sort(
        (a, b) => b.total - a.total
    );

    alert(
        "Highest Q1 sales : " + nameTotals[0].name
        + '\n' +
        "Lowest Q1 sales : " + nameTotals[3].name 
        );
 }
 
 function commissionsByMonth() {
    
    const sales = [
        {jan:45.00, feb:50.00, mar:47.00},
        {jan:95.00, feb:73.00, mar:40.00},
        {jan:10.00, feb:32.00, mar:24.00},
        {jan:86.00, feb:74.00, mar:80.00}
    ];
    
    const nameTotals = [
        {name:"East (Matt)", total : [sales[0].jan + sales[0].feb + sales[0].mar]},
        {name:"West (Mike)", total : [sales[1].jan + sales[1].feb + sales[1].mar]},
        {name:"Westshore (Mark)", total : [sales[2].jan + sales[2].feb + sales[2].mar]},
        {name:"Metro (Milt)", total : [sales[3].jan + sales[3].feb + sales[3].mar]}
    ];
    
    const commJan = [
        (.13 * sales[0].jan).toFixed(2),
        (.13 * sales[1].jan).toFixed(2),        
        (.13 * sales[2].jan).toFixed(2),
        (.13 * sales[3].jan).toFixed(2)
    ];
    const commFeb = [
        (.13 * sales[0].feb).toFixed(2),
        (.13 * sales[1].feb).toFixed(2),        
        (.13 * sales[2].feb).toFixed(2),
        (.13 * sales[3].feb).toFixed(2)
    ];

    const commMar = [
        (.13 * sales[0].mar).toFixed(2),
        (.13 * sales[1].mar).toFixed(2),        
        (.13 * sales[2].mar).toFixed(2),
        (.13 * sales[3].mar).toFixed(2)
    ];

    alert(
        nameTotals[0].name + " commissions : " 
        + '\n' + 
        "January: $" + commJan[0]
        + '\n' + 
        "February: $" + commFeb[0]
        + '\n' + 
        "March: $" + commMar[0]
        + '\n' + '\n' +
        nameTotals[1].name + " commissions : " 
        + '\n' +
        "January: $" + commJan[1]
        + '\n' +
        "February: $" + commFeb[1]
        + '\n' +
        "March: $" + commMar[1]
        + '\n' + '\n' +
        nameTotals[2].name + " commissions : " 
        + '\n' +
        "January: $" + commJan[2]
        + '\n' +
        "February: $" + commFeb[2]
        + '\n' +
        "March: $" + commMar[2]
        + '\n' + '\n' +
        nameTotals[3].name + " commissions : " 
        + '\n' +
        "January: $" + commJan[3]
        + '\n' +
        "February: $" + commFeb[3]
        + '\n' +
        "March: $" + commMar[3]
        );
 }