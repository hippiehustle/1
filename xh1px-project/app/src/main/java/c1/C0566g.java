package c1;

import F4.s;
import L7.AbstractC0160s;
import P1.w;
import R3.r;
import U1.m;
import U1.n;
import U1.o;
import a5.C0423g;
import android.content.Context;
import android.util.LruCache;
import c2.z;
import com.buzbuz.smartautoclicker.core.database.ClickDatabase;
import com.buzbuz.smartautoclicker.core.database.TutorialDatabase;
import com.buzbuz.smartautoclicker.core.dumb.data.database.DumbDatabase;
import h7.u;
import i1.C0879a;
import j1.AbstractC0900a;
import java.io.File;
import m2.l;
import o2.C1229a;
import q2.C1357c;
import q2.C1365k;
import r1.C1428b;
import s1.C1479b;
import u1.C1626a;
import u1.C1629d;
import w3.C1695d;
import x3.C1787d;
import y2.p;

/* renamed from: c1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566g implements Y5.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f9445a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9446b;

    public C0566g(h hVar, int i4) {
        this.f9445a = hVar;
        this.f9446b = i4;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [q1.a, android.util.LruCache] */
    /* JADX WARN: Type inference failed for: r2v4, types: [O7.Y, java.lang.Object] */
    @Override // Y5.c
    public final Object get() {
        h hVar = this.f9445a;
        int i4 = this.f9446b;
        switch (i4) {
            case 0:
                return new Object();
            case 1:
                return new C1.g((Y1.d) hVar.f9471d.get(), (H1.b) hVar.f9472e.get());
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new Y1.d((Context) hVar.f9468a.f6634e);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new H1.b((Context) hVar.f9468a.f6634e);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Context context = (Context) hVar.f9468a.f6634e;
                ?? obj = new Object();
                obj.f4116d = new a2.j(obj);
                return new a2.h(context, obj, new A4.a((q1.e) hVar.f9475h.get()));
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                ?? lruCache = new LruCache((int) (((int) (Runtime.getRuntime().maxMemory() / 1024)) * 0.5d));
                hVar.getClass();
                return new q1.e(lruCache, new r(AbstractC0900a.b(), (File) hVar.f9474g.get()));
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                File filesDir = ((Context) hVar.f9468a.f6634e).getFilesDir();
                o6.j.d(filesDir, "getFilesDir(...)");
                return filesDir;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return new J2.b((Y1.d) hVar.f9471d.get());
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new g3.e((C1229a) hVar.f9478m.get());
            case 9:
                return new C1229a((l) hVar.f9477l.get());
            case 10:
                return new l((DumbDatabase) hVar.k.get());
            case 11:
                Context applicationContext = ((Context) hVar.f9468a.f6634e).getApplicationContext();
                o6.j.d(applicationContext, "getApplicationContext(...)");
                return (DumbDatabase) u.b(applicationContext, DumbDatabase.class, "dumb_database").b();
            case 12:
                return new C1365k((C1229a) hVar.f9478m.get(), (C1357c) hVar.f9487v.get(), (x2.f) hVar.f9489x.get());
            case 13:
                return new C1357c((C1428b) hVar.f9486u.get());
            case 14:
                C1428b c1428b = (C1428b) hVar.f9485t.get();
                o6.j.e(c1428b, "actionExecutor");
                return c1428b;
            case 15:
                return new C1428b((C1479b) hVar.f9480o.get(), (C1626a) hVar.f9483r.get(), (v1.a) hVar.f9484s.get());
            case 16:
                return new Object();
            case 17:
                return new C1626a((Context) hVar.f9468a.f6634e, (o1.a) hVar.f9481p.get(), (C1629d) hVar.f9482q.get());
            case 18:
                return new o1.a();
            case 19:
                return new C1629d(AbstractC0900a.b(), (Context) hVar.f9468a.f6634e);
            case 20:
                return new Object();
            case 21:
                AbstractC0160s b4 = AbstractC0900a.b();
                p pVar = (p) hVar.f9488w.get();
                o6.j.e(pVar, "dataSource");
                return new x2.f(b4, pVar);
            case 22:
                return new p(AbstractC0900a.b(), (Context) hVar.f9468a.f6634e);
            case 23:
                return new L4.j((Context) hVar.f9468a.f6634e, (b2.r) hVar.f9449C.get(), (v2.h) hVar.f9452F.get(), (F4.i) hVar.f9453G.get(), (s) hVar.f9454H.get(), (F4.j) hVar.f9455I.get(), AbstractC0900a.a());
            case 24:
                z zVar = (z) hVar.f9448B.get();
                q1.e eVar = (q1.e) hVar.f9475h.get();
                o6.j.e(zVar, "dataSource");
                o6.j.e(eVar, "bitmapManager");
                return new b2.r(zVar, eVar);
            case 25:
                return new z((ClickDatabase) hVar.f9491z.get(), (TutorialDatabase) hVar.f9447A.get());
            case 26:
                Context applicationContext2 = ((Context) hVar.f9468a.f6634e).getApplicationContext();
                o6.j.d(applicationContext2, "getApplicationContext(...)");
                u0.s b9 = u.b(applicationContext2, ClickDatabase.class, "click_database");
                b9.a(U1.i.f6056d, U1.i.f6057e, U1.j.f6059c, U1.l.f6066c, m.f6069c, n.f6074c, o.f6077c, U1.d.f6028c, U1.h.f6049c);
                return (ClickDatabase) b9.b();
            case 27:
                Context applicationContext3 = ((Context) hVar.f9468a.f6634e).getApplicationContext();
                o6.j.d(applicationContext3, "getApplicationContext(...)");
                u0.s b10 = u.b(applicationContext3, TutorialDatabase.class, "tutorial_database");
                b10.a(U1.d.f6028c, U1.h.f6049c);
                return (TutorialDatabase) b10.b();
            case 28:
                return new v2.h((Context) hVar.f9468a.f6634e, AbstractC0900a.a(), AbstractC0900a.b(), (b2.r) hVar.f9449C.get(), (r2.j) hVar.f9451E.get());
            case 29:
                return new r2.j(AbstractC0900a.b(), (Y1.d) hVar.f9471d.get(), (q1.e) hVar.f9475h.get(), new u2.b((Y1.d) hVar.f9471d.get()), (a2.h) hVar.f9476i.get(), (C1428b) hVar.f9486u.get(), (x2.f) hVar.f9489x.get(), (C0879a) hVar.f9450D.get());
            case 30:
                C0879a c0879a = (C0879a) hVar.f9470c.get();
                o6.j.e(c0879a, "appComponentsManager");
                return c0879a;
            case 31:
                return new F4.i();
            case 32:
                return new s((TutorialDatabase) hVar.f9447A.get(), (q1.e) hVar.f9475h.get(), (b2.r) hVar.f9449C.get());
            case 33:
                return new F4.j((C1.g) hVar.f9473f.get(), (J2.b) hVar.j.get(), AbstractC0900a.a());
            case 34:
                return new H3.n((b2.r) hVar.f9449C.get(), (q1.e) hVar.f9475h.get());
            case 35:
                return new A3.a();
            case 36:
                return new C4.f((Context) hVar.f9468a.f6634e);
            case 37:
                return new b3.n((Context) hVar.f9468a.f6634e, (DumbDatabase) hVar.k.get(), (C1229a) hVar.f9478m.get(), (ClickDatabase) hVar.f9491z.get(), (b2.r) hVar.f9449C.get());
            case 38:
                return new C1787d((Context) hVar.f9468a.f6634e, AbstractC0900a.b(), (C1229a) hVar.f9478m.get(), (C1365k) hVar.f9490y.get(), (b2.r) hVar.f9449C.get(), (v2.h) hVar.f9452F.get(), (C1695d) hVar.f9460O.get());
            case 39:
                return new C1695d(AbstractC0900a.b(), (Context) hVar.f9468a.f6634e);
            case 40:
                return new C0423g(AbstractC0900a.b(), (Context) hVar.f9468a.f6634e);
            case 41:
                return new w((Context) hVar.f9468a.f6634e, (P1.o) hVar.f9464S.get(), AbstractC0900a.b(), AbstractC0900a.a());
            case 42:
                return new P1.o((N1.c) hVar.f9463R.get(), AbstractC0900a.b());
            case 43:
                return new N1.c(AbstractC0900a.b(), (Context) hVar.f9468a.f6634e);
            case 44:
                B3.a aVar = (B3.a) hVar.f9466U.get();
                o6.j.e(aVar, "reviewRepository");
                return aVar;
            case 45:
                return new Object();
            default:
                throw new AssertionError(i4);
        }
    }
}
