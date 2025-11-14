package D6;

import a1.C0414a;
import android.view.View;
import f7.C0722b;
import f7.C0725e;
import g0.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q7.InterfaceC1423d;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public abstract class b implements a, T0.e, Y6.m, InterfaceC1423d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1022d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1023e;

    public b(List list) {
        this.f1022d = 2;
        this.f1023e = list;
    }

    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        if (i4 != 1) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i4 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i4 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 != 1) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static /* synthetic */ void H0(int i4) {
        String str;
        int i8;
        if (i4 != 1 && i4 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1 && i4 != 2) {
            objArr[0] = "receiverType";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        }
        if (i4 != 1) {
            if (i4 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i4 != 1 && i4 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // T0.e
    public List B0() {
        return (List) this.f1023e;
    }

    @Override // Y6.m
    public Y6.l C(C0722b c0722b) {
        return null;
    }

    @Override // T0.e
    public boolean E0() {
        List list = (List) this.f1023e;
        if (list.isEmpty() || (list.size() == 1 && ((C0414a) list.get(0)).c())) {
            return true;
        }
        return false;
    }

    public boolean I0() {
        int i4;
        g0 g0Var = (g0) this.f1023e;
        View view = g0Var.f11024c.K;
        if (view != null) {
            i4 = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i4 = 3;
                        } else {
                            throw new IllegalArgumentException(A.j.l("Unknown visibility ", visibility));
                        }
                    }
                } else {
                    i4 = 2;
                }
            }
        } else {
            i4 = 0;
        }
        int i8 = g0Var.f11022a;
        if (i4 != i8) {
            if (i4 == 2 || i8 == 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public abstract void J0(String[] strArr);

    @Override // q7.InterfaceC1423d
    public AbstractC1759v b() {
        AbstractC1759v abstractC1759v = (AbstractC1759v) this.f1023e;
        if (abstractC1759v != null) {
            return abstractC1759v;
        }
        H0(1);
        throw null;
    }

    @Override // D6.a
    public j getAnnotations() {
        j jVar = (j) this.f1023e;
        if (jVar != null) {
            return jVar;
        }
        G0(1);
        throw null;
    }

    @Override // Y6.m
    public void k() {
        J0((String[]) ((ArrayList) this.f1023e).toArray(new String[0]));
    }

    public String toString() {
        switch (this.f1022d) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f1023e;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // Y6.m
    public void y0(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.f1023e).add((String) obj);
        }
    }

    public b(Y1.d dVar) {
        this.f1022d = 1;
        o6.j.e(dVar, "displayConfigManager");
        this.f1023e = dVar;
    }

    public b(j jVar) {
        this.f1022d = 0;
        if (jVar != null) {
            this.f1023e = jVar;
        } else {
            G0(0);
            throw null;
        }
    }

    public b(AbstractC1759v abstractC1759v) {
        this.f1022d = 5;
        if (abstractC1759v != null) {
            this.f1023e = abstractC1759v;
        } else {
            H0(0);
            throw null;
        }
    }

    public b() {
        this.f1022d = 3;
        this.f1023e = new ArrayList();
    }

    public b(g0 g0Var) {
        this.f1022d = 4;
        o6.j.e(g0Var, "operation");
        this.f1023e = g0Var;
    }

    @Override // Y6.m
    public void X(k7.f fVar) {
    }

    @Override // Y6.m
    public void V(C0722b c0722b, C0725e c0725e) {
    }
}
