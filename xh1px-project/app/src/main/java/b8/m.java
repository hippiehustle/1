package b8;

import Z7.Q;
import a6.AbstractC0425A;
import a6.x;
import a8.u;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o6.v;
import o6.w;

/* loaded from: classes.dex */
public class m extends kotlinx.serialization.json.internal.a {

    /* renamed from: f, reason: collision with root package name */
    public final u f9269f;

    /* renamed from: g, reason: collision with root package name */
    public final X7.f f9270g;

    /* renamed from: h, reason: collision with root package name */
    public int f9271h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9272i;

    public /* synthetic */ m(a8.b bVar, u uVar, String str, int i4) {
        this(bVar, uVar, (i4 & 4) != 0 ? null : str, (X7.f) null);
    }

    @Override // kotlinx.serialization.json.internal.a
    public String Q(X7.f fVar, int i4) {
        Object obj;
        o6.j.e(fVar, "descriptor");
        a8.b bVar = this.f12164c;
        j.o(fVar, bVar);
        String d2 = fVar.d(i4);
        if (this.f12166e.f7036c && !S().f8299d.keySet().contains(d2)) {
            W5.a aVar = bVar.f8282c;
            A1.n nVar = new A1.n(fVar, 15, bVar);
            aVar.getClass();
            k kVar = j.f9266a;
            Object G8 = aVar.G(fVar, kVar);
            if (G8 == null) {
                G8 = nVar.a();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar.f6634e;
                Object obj2 = concurrentHashMap.get(fVar);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(fVar, obj2);
                }
                ((Map) obj2).put(kVar, G8);
            }
            Map map = (Map) G8;
            Iterator it = S().f8299d.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Integer num = (Integer) map.get((String) obj);
                    if (num != null && num.intValue() == i4) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return d2;
    }

    @Override // kotlinx.serialization.json.internal.a
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public u S() {
        return this.f9269f;
    }

    @Override // kotlinx.serialization.json.internal.a
    public a8.j c(String str) {
        o6.j.e(str, "tag");
        return (a8.j) x.M0(S(), str);
    }

    @Override // kotlinx.serialization.json.internal.a, Y7.b
    public final boolean f() {
        if (!this.f9272i && super.f()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.json.internal.a, Y7.a
    public void g(X7.f fVar) {
        Set set;
        Set g02;
        o6.j.e(fVar, "descriptor");
        a8.b bVar = this.f12164c;
        if (!j.l(fVar, bVar) && !(fVar.e() instanceof X7.c)) {
            j.o(fVar, bVar);
            if (!this.f12166e.f7036c) {
                g02 = Q.b(fVar);
            } else {
                Set b4 = Q.b(fVar);
                Map map = (Map) bVar.f8282c.G(fVar, j.f9266a);
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = a6.u.f7768d;
                }
                g02 = AbstractC0425A.g0(b4, set);
            }
            for (String str : S().f8299d.keySet()) {
                if (!g02.contains(str) && !o6.j.a(str, this.f12165d)) {
                    StringBuilder s8 = A.j.s("Encountered an unknown key '", str, "' at element: ");
                    s8.append(U());
                    s8.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                    s8.append((Object) j.n(S().toString(), -1));
                    throw j.e(s8.toString(), -1);
                }
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.a, Y7.b
    public final Y7.a j(X7.f fVar) {
        o6.j.e(fVar, "descriptor");
        X7.f fVar2 = this.f9270g;
        if (fVar == fVar2) {
            a8.j d2 = d();
            String b4 = fVar2.b();
            if (d2 instanceof u) {
                String str = this.f12165d;
                return new m(this.f12164c, (u) d2, str, fVar2);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            w wVar = v.f13643a;
            sb.append(wVar.b(u.class).c());
            sb.append(", but had ");
            sb.append(wVar.b(d2.getClass()).c());
            sb.append(" as the serialized body of ");
            sb.append(b4);
            sb.append(" at element: ");
            sb.append(U());
            throw j.d(-1, sb.toString(), d2.toString());
        }
        return super.j(fVar);
    }

    @Override // Y7.a
    public int n(X7.f fVar) {
        boolean z8;
        o6.j.e(fVar, "descriptor");
        while (this.f9271h < fVar.c()) {
            int i4 = this.f9271h;
            this.f9271h = i4 + 1;
            String R5 = R(fVar, i4);
            int i8 = this.f9271h - 1;
            this.f9272i = false;
            if (!S().containsKey(R5)) {
                if (!this.f12164c.f8280a.f7035b && !fVar.k(i8) && fVar.j(i8).h()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f9272i = z8;
                if (z8) {
                }
            }
            this.f12166e.getClass();
            return i8;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a8.b bVar, u uVar, String str, X7.f fVar) {
        super(bVar, str);
        o6.j.e(bVar, "json");
        o6.j.e(uVar, "value");
        this.f9269f = uVar;
        this.f9270g = fVar;
    }
}
