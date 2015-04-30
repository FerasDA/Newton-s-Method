x=1.1;                                         %set starting value 
nmax=10;                                       %set max number of iterations 
eps=1;                                         %initialize error bound eps 
xvals=x;                                       %initialize array of iterates 
n=1;                                           %initialize n (counts iterations)

while eps>=1e-5&n<=nmax                        %set while-conditions 
    y=x-((4*tan(x)-6*x)/(4*((1/cos(x))^2)-6)); %compute next iterate 
    xvals=[xvals;y];                           %write next iterate in array 
    eps=abs(y-x);                              %compute error 
    x=y;n=n+1;                                 %update x and n 
end             