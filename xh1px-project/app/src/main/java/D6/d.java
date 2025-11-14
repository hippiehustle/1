package D6;

import C6.InterfaceC0004e;
import C6.O;
import f7.C0723c;
import h7.C0845h;
import java.util.Map;
import m7.AbstractC1098d;
import w7.AbstractC1759v;
import w7.z;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1759v f1024a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f1025b;

    /* renamed from: c, reason: collision with root package name */
    public final O f1026c;

    public d(z zVar, Map map, O o7) {
        if (zVar != null) {
            if (map != null) {
                this.f1024a = zVar;
                this.f1025b = map;
                this.f1026c = o7;
                return;
            }
            d(1);
            throw null;
        }
        d(0);
        throw null;
    }

    public static /* synthetic */ void d(int i4) {
        String str;
        int i8;
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4 && i4 != 5) {
                    objArr[0] = "annotationType";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                }
            } else {
                objArr[0] = "source";
            }
        } else {
            objArr[0] = "valueArguments";
        }
        if (i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getAllValueArguments";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 3 || i4 == 4 || i4 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // D6.c
    public final C0723c a() {
        InterfaceC0004e d2 = AbstractC1098d.d(this);
        if (d2 != null) {
            if (y7.l.f(d2)) {
                d2 = null;
            }
            if (d2 != null) {
                return AbstractC1098d.c(d2);
            }
        }
        return null;
    }

    @Override // D6.c
    public final AbstractC1759v b() {
        AbstractC1759v abstractC1759v = this.f1024a;
        if (abstractC1759v != null) {
            return abstractC1759v;
        }
        d(3);
        throw null;
    }

    @Override // D6.c
    public final Map c() {
        Map map = this.f1025b;
        if (map != null) {
            return map;
        }
        d(4);
        throw null;
    }

    @Override // D6.c
    public final O h() {
        O o7 = this.f1026c;
        if (o7 != null) {
            return o7;
        }
        d(5);
        throw null;
    }

    public final String toString() {
        return C0845h.f11446c.v(this, null);
    }
}
