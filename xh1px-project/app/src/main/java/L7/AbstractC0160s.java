package L7;

import d6.AbstractC0615a;
import d6.C0618d;
import d6.InterfaceC0619e;
import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;

/* renamed from: L7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0160s extends AbstractC0615a implements InterfaceC0619e {

    /* renamed from: e, reason: collision with root package name */
    public static final r f3242e = new r(C0618d.f10447d, new H7.o(9));

    public AbstractC0160s() {
        super(C0618d.f10447d);
    }

    @Override // d6.AbstractC0615a, d6.InterfaceC0622h
    public final InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        InterfaceC0620f interfaceC0620f;
        o6.j.e(interfaceC0621g, "key");
        if (interfaceC0621g instanceof r) {
            r rVar = (r) interfaceC0621g;
            InterfaceC0621g interfaceC0621g2 = this.f10444d;
            if ((interfaceC0621g2 == rVar || rVar.f3240e == interfaceC0621g2) && (interfaceC0620f = (InterfaceC0620f) rVar.f3239d.m(this)) != null) {
                return interfaceC0620f;
            }
        } else if (C0618d.f10447d == interfaceC0621g) {
            return this;
        }
        return null;
    }

    public abstract void N(InterfaceC0622h interfaceC0622h, Runnable runnable);

    public void O(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        Q7.b.i(this, interfaceC0622h, runnable);
    }

    public boolean P(InterfaceC0622h interfaceC0622h) {
        return !(this instanceof p0);
    }

    public AbstractC0160s Q(int i4) {
        Q7.b.a(i4);
        return new Q7.g(this, i4);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0166y.l(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((d6.InterfaceC0620f) r3.f3239d.m(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return d6.C0623i.f10448d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (d6.C0618d.f10447d == r3) goto L15;
     */
    @Override // d6.AbstractC0615a, d6.InterfaceC0622h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0622h y(InterfaceC0621g interfaceC0621g) {
        o6.j.e(interfaceC0621g, "key");
        if (interfaceC0621g instanceof r) {
            r rVar = (r) interfaceC0621g;
            InterfaceC0621g interfaceC0621g2 = this.f10444d;
            if (interfaceC0621g2 != rVar && rVar.f3240e != interfaceC0621g2) {
                return this;
            }
        }
    }
}
