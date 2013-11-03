%.dvi : %.tex
	platex $< -halt-on-error
	platex $< -halt-on-error
%.pdf : %.dvi
	dvipdfmx $<