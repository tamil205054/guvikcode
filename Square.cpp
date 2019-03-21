#include <iostream> 
using namespace std; 
 
struct Point { 
	int x, y; 
}; 
int distSq(Point p, Point q) 
{ 
	return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y); 
} 

bool isSquare(Point p1, Point p2, Point p3, Point p4) 
{ 
	int d2 = distSq(p1, p2); 
	int d3 = distSq(p1, p3);  
	int d4 = distSq(p1, p4);  
 
	if (d2 == d3 && 2 * d2 == d4 && 2 * d2 == distSq(p2, p3)) { 
		int d = distSq(p2, p4); 
		return (d == distSq(p3, p4) && d == d2); 
	} 
 
	if (d3 == d4 && 2 * d3 == d2 && 2 * d3 == distSq(p3, p4)) { 
		int d = distSq(p2, p3); 
		return (d == distSq(p2, p4) && d == d3); 
	} 
	if (d2 == d4 && 2 * d2 == d3 && 2 * d2 == distSq(p2, p4)) { 
		int d = distSq(p2, p3); 
		return (d == distSq(p3, p4) && d == d2); 
	} 

	return false; 
}  
int main() 
{ 
int p11,p12,p21,p22,p31,p32,p41,p42;
cin>>p11;cin>>p12;
cin>>p21;cin>>p22;
cin>>p31;cin>>p32;
cin>>p41;cin>>p42;
	Point p1 = { p11, p12 }, p2 = { p21, p22 }, 
		p3 = { p31, p32 }, p4 = { p41, p42 }; 
	isSquare(p1, p2, p3, p4) ? cout << "yes" : cout << "no"; 
	return 0; 
} 
