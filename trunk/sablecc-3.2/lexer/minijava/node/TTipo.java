/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import minijava.analysis.*;

@SuppressWarnings("nls")
public final class TTipo extends Token
{
    public TTipo()
    {
        super.setText("type");
    }

    public TTipo(int line, int pos)
    {
        super.setText("type");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTipo(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTipo(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTipo text.");
    }
}