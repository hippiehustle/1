package z;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1849f implements InterfaceC1847d {

    /* renamed from: d, reason: collision with root package name */
    public final m f16594d;

    /* renamed from: f, reason: collision with root package name */
    public int f16596f;

    /* renamed from: g, reason: collision with root package name */
    public int f16597g;

    /* renamed from: a, reason: collision with root package name */
    public m f16591a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16592b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16593c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f16595e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f16598h = 1;

    /* renamed from: i, reason: collision with root package name */
    public C1850g f16599i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f16600l = new ArrayList();

    public C1849f(m mVar) {
        this.f16594d = mVar;
    }

    @Override // z.InterfaceC1847d
    public final void a(InterfaceC1847d interfaceC1847d) {
        ArrayList arrayList = this.f16600l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1849f) it.next()).j) {
                return;
            }
        }
        this.f16593c = true;
        m mVar = this.f16591a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f16592b) {
            this.f16594d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C1849f c1849f = null;
        int i4 = 0;
        while (it2.hasNext()) {
            C1849f c1849f2 = (C1849f) it2.next();
            if (!(c1849f2 instanceof C1850g)) {
                i4++;
                c1849f = c1849f2;
            }
        }
        if (c1849f != null && i4 == 1 && c1849f.j) {
            C1850g c1850g = this.f16599i;
            if (c1850g != null) {
                if (c1850g.j) {
                    this.f16596f = this.f16598h * c1850g.f16597g;
                } else {
                    return;
                }
            }
            d(c1849f.f16597g + this.f16596f);
        }
        m mVar2 = this.f16591a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(m mVar) {
        this.k.add(mVar);
        if (this.j) {
            mVar.a(mVar);
        }
    }

    public final void c() {
        this.f16600l.clear();
        this.k.clear();
        this.j = false;
        this.f16597g = 0;
        this.f16593c = false;
        this.f16592b = false;
    }

    public void d(int i4) {
        if (!this.j) {
            this.j = true;
            this.f16597g = i4;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                InterfaceC1847d interfaceC1847d = (InterfaceC1847d) it.next();
                interfaceC1847d.a(interfaceC1847d);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16594d.f16606b.f16354W);
        sb.append(":");
        switch (this.f16595e) {
            case 1:
                str = "UNKNOWN";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                str = "HORIZONTAL_DIMENSION";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                str = "VERTICAL_DIMENSION";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                str = "LEFT";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                str = "RIGHT";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "TOP";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "BOTTOM";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.f16597g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f16600l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
