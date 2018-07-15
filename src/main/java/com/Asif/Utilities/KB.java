package com.Asif.Utilities;

import io.appium.java_client.touch.offset.PointOption;

public enum KB {

	a(113,1389),
	b(635,1546),
	c(421,1546),
	d(329,1389),
	e(271,1241),
	f(429,1389),
	g(538,1389),
	h(643,1389),
	i(803,1241),
	j(751,1389),
	k(851,1389),
	l(961,1389),
	m(853,1546),
	n(751,1546),
	o(906,1241),
	p(1014,1241),
	q(63,1241),
	r(369,1241),
	s(217,1389),
	t(482,1241),
	u(693,1241),
	v(540,1546),
	w(161,1241),
	x(324,1546),
	y(590,1241),
	z(208,1546),
	A(113,1389),
	B(635,1546),
	C(421,1546),
	D(329,1389),
	E(271,1241),
	F(429,1389),
	G(538,1389),
	H(643,1389),
	I(803,1241),
	J(751,1389),
	K(851,1389),
	L(961,1389),
	M(853,1546),
	N(751,1546),
	O(906,1241),
	P(1014,1241),
	Q(63,1241),
	R(369,1241),
	S(217,1389),
	T(482,1241),
	U(693,1241),
	V(540,1546),
	W(161,1241),
	X(324,1546),
	Y(590,1241),
	Z(208,1546),
	UpperCase(83,1547),
	BackSpace(988,1547),
	Return(980,1697),
	space(555,1697);
	
	
	
	
	private final int x_coordinate;
    private final int y_coordinate;
    
    
    private KB(int x_coordinate, int y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }
    
    public PointOption getPoint() {
        return PointOption.point(x_coordinate,x_coordinate);
    }
    
    public  int[] getCoordinateA() {
        
    	int A[] = {x_coordinate, y_coordinate};
    	return A;
    }
	
}
