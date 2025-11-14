package f6;

import d6.InterfaceC0617c;
import o6.v;

/* renamed from: f6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0720j extends AbstractC0713c implements o6.h {

    /* renamed from: g, reason: collision with root package name */
    public final int f10790g;

    public AbstractC0720j(int i4, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f10790g = i4;
    }

    @Override // o6.h
    public final int d() {
        return this.f10790g;
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
