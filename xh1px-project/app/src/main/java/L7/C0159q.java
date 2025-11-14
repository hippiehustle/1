package L7;

import d6.C0616b;
import d6.C0618d;
import d6.C0623i;
import d6.InterfaceC0619e;
import d6.InterfaceC0620f;
import d6.InterfaceC0622h;
import n6.InterfaceC1164c;

/* renamed from: L7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0159q implements InterfaceC1164c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3237d;

    public /* synthetic */ C0159q(int i4) {
        this.f3237d = i4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        Integer num;
        int i4;
        C0616b c0616b;
        switch (this.f3237d) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((InterfaceC0622h) obj).D((InterfaceC0620f) obj2);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return ((InterfaceC0622h) obj).D((InterfaceC0620f) obj2);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                InterfaceC0620f interfaceC0620f = (InterfaceC0620f) obj2;
                if (interfaceC0620f instanceof Q7.v) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i4 = num.intValue();
                    } else {
                        i4 = 1;
                    }
                    if (i4 == 0) {
                        return interfaceC0620f;
                    }
                    return Integer.valueOf(i4 + 1);
                }
                return obj;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Q7.v vVar = (Q7.v) obj;
                InterfaceC0620f interfaceC0620f2 = (InterfaceC0620f) obj2;
                if (vVar == null) {
                    if (interfaceC0620f2 instanceof Q7.v) {
                        return (Q7.v) interfaceC0620f2;
                    }
                    return null;
                }
                return vVar;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Q7.y yVar = (Q7.y) obj;
                InterfaceC0620f interfaceC0620f3 = (InterfaceC0620f) obj2;
                if (interfaceC0620f3 instanceof Q7.v) {
                    Q7.v vVar2 = (Q7.v) interfaceC0620f3;
                    Object c6 = vVar2.c(yVar.f4977a);
                    Object[] objArr = yVar.f4978b;
                    int i8 = yVar.f4980d;
                    objArr[i8] = c6;
                    Q7.v[] vVarArr = yVar.f4979c;
                    yVar.f4980d = i8 + 1;
                    vVarArr[i8] = vVar2;
                }
                return yVar;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) obj;
                InterfaceC0620f interfaceC0620f4 = (InterfaceC0620f) obj2;
                o6.j.e(str, "acc");
                o6.j.e(interfaceC0620f4, "element");
                if (str.length() == 0) {
                    return interfaceC0620f4.toString();
                }
                return str + ", " + interfaceC0620f4;
            default:
                InterfaceC0622h interfaceC0622h = (InterfaceC0622h) obj;
                InterfaceC0620f interfaceC0620f5 = (InterfaceC0620f) obj2;
                o6.j.e(interfaceC0622h, "acc");
                o6.j.e(interfaceC0620f5, "element");
                InterfaceC0622h y4 = interfaceC0622h.y(interfaceC0620f5.getKey());
                C0623i c0623i = C0623i.f10448d;
                if (y4 != c0623i) {
                    C0618d c0618d = C0618d.f10447d;
                    InterfaceC0619e interfaceC0619e = (InterfaceC0619e) y4.B(c0618d);
                    if (interfaceC0619e == null) {
                        c0616b = new C0616b(interfaceC0620f5, y4);
                    } else {
                        InterfaceC0622h y5 = y4.y(c0618d);
                        if (y5 == c0623i) {
                            return new C0616b(interfaceC0619e, interfaceC0620f5);
                        }
                        c0616b = new C0616b(interfaceC0619e, new C0616b(interfaceC0620f5, y5));
                    }
                    return c0616b;
                }
                return interfaceC0620f5;
        }
    }
}
