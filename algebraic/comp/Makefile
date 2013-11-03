%.dvi : %.tex
	platex $< -halt-on-error
%.pdf : %.dvi
	dvipdfmx $<
