package f6;

import d6.InterfaceC0617c;
import o6.v;

/* renamed from: f6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0719i extends AbstractC0718h implements o6.h {

    /* renamed from: e, reason: collision with root package name */
    public final int f10789e;

    public AbstractC0719i(int i4, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f10789e = i4;
    }

    @Override // o6.h
    public final int d() {
        return this.f10789e;
    }

    @Override // f6.AbstractC0711a
    public final String toString() {
        if (this.f10780d == null) {
            String g8 = v.f13643a.g(this);
            o6.j.d(g8, "renderLambdaToString(...)");
            return g8;
        }
        return super.toString();
    }
}
