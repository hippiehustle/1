package q0;

import E.v;
import H7.m;
import I7.i;
import O7.P;
import O7.U;
import O7.V;
import O7.Y;
import O7.i0;
import P.C0267o;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a6.C0433h;
import a6.q;
import a6.s;
import a6.x;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.e0;
import c0.o;
import h6.AbstractC0837b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import n0.AbstractC1120J;
import n0.AbstractC1143u;
import n0.C1111A;
import n0.C1118H;
import n0.C1121K;
import n0.C1131i;
import n0.C1132j;
import n0.C1133k;
import n0.C1134l;
import n0.C1135m;
import n0.C1142t;
import n0.C1144v;
import n0.C1146x;
import n0.C1148z;
import n0.InterfaceC1127e;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import o.C1207p;
import o3.C1234e;
import o6.j;
import o6.r;
import o6.y;
import q4.X;
import s3.AbstractC1492c;
import t.k;
import u.AbstractC1595a;

/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1350f {

    /* renamed from: a, reason: collision with root package name */
    public final C1146x f13883a;

    /* renamed from: b, reason: collision with root package name */
    public final C1133k f13884b;

    /* renamed from: c, reason: collision with root package name */
    public C1144v f13885c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f13886d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle[] f13887e;

    /* renamed from: f, reason: collision with root package name */
    public final C0433h f13888f = new C0433h();

    /* renamed from: g, reason: collision with root package name */
    public final i0 f13889g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f13890h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f13891i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f13892l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0510v f13893m;

    /* renamed from: n, reason: collision with root package name */
    public C1135m f13894n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f13895o;

    /* renamed from: p, reason: collision with root package name */
    public EnumC0504o f13896p;

    /* renamed from: q, reason: collision with root package name */
    public final C0.a f13897q;

    /* renamed from: r, reason: collision with root package name */
    public final C1121K f13898r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f13899s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1163b f13900t;

    /* renamed from: u, reason: collision with root package name */
    public C1347c f13901u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f13902v;

    /* renamed from: w, reason: collision with root package name */
    public int f13903w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f13904x;

    /* renamed from: y, reason: collision with root package name */
    public final U f13905y;

    public C1350f(C1146x c1146x, C1133k c1133k) {
        this.f13883a = c1146x;
        this.f13884b = c1133k;
        s sVar = s.f7766d;
        this.f13889g = V.c(sVar);
        this.f13890h = V.c(sVar);
        this.f13891i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.f13892l = new LinkedHashMap();
        this.f13895o = new ArrayList();
        this.f13896p = EnumC0504o.f8847e;
        this.f13897q = new C0.a(2, this);
        this.f13898r = new C1121K();
        this.f13899s = new LinkedHashMap();
        this.f13902v = new LinkedHashMap();
        this.f13904x = new ArrayList();
        this.f13905y = V.b(2);
    }

    public static AbstractC1143u d(int i4, AbstractC1143u abstractC1143u, AbstractC1143u abstractC1143u2, boolean z8) {
        C1144v c1144v;
        if (abstractC1143u.f12813e.f13342a == i4 && (abstractC1143u2 == null || (abstractC1143u.equals(abstractC1143u2) && j.a(abstractC1143u.f12814f, abstractC1143u2.f12814f)))) {
            return abstractC1143u;
        }
        if (abstractC1143u instanceof C1144v) {
            c1144v = (C1144v) abstractC1143u;
        } else {
            c1144v = null;
        }
        if (c1144v == null) {
            c1144v = abstractC1143u.f12814f;
            j.b(c1144v);
        }
        return c1144v.j.b(i4, c1144v, abstractC1143u2, z8);
    }

    public static /* synthetic */ void n(C1350f c1350f, C1131i c1131i) {
        c1350f.m(c1131i, false, new C0433h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0177, code lost:
    
        if (r15.hasPrevious() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0179, code lost:
    
        r1 = r15.previous();
        r3 = ((n0.C1131i) r1).f12759e;
        r5 = r11.f13885c;
        o6.j.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018b, code lost:
    
        if (o6.j.a(r3, r5) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018d, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018e, code lost:
    
        r6 = (n0.C1131i) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0190, code lost:
    
        if (r6 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        r15 = r11.f13885c;
        o6.j.b(r15);
        r1 = r11.f13885c;
        o6.j.b(r1);
        r6 = n0.C1118H.a(r0, r15, r1.g(r13), h(), r11.f13894n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01aa, code lost:
    
        r2.addFirst(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ad, code lost:
    
        r13 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b5, code lost:
    
        if (r13.hasNext() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b7, code lost:
    
        r15 = (n0.C1131i) r13.next();
        r0 = r11.f13899s.get(r11.f13898r.b(r15.f12759e.f12812d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cd, code lost:
    
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cf, code lost:
    
        ((n0.C1134l) r0).a(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ed, code lost:
    
        throw new java.lang.IllegalStateException(A.j.r(new java.lang.StringBuilder("NavigatorBackStack for "), r12.f12812d, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ee, code lost:
    
        r4.addAll(r2);
        r4.addLast(r14);
        r12 = a6.AbstractC0436k.D0(r2, r14).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0200, code lost:
    
        if (r12.hasNext() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0202, code lost:
    
        r13 = (n0.C1131i) r12.next();
        r14 = r13.f12759e.f12814f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x020c, code lost:
    
        if (r14 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x020e, code lost:
    
        j(r13, e(r14.f12813e.f13342a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x021a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0162, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0143, code lost:
    
        r1 = r4.f7762e[r4.f7761d];
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0099, code lost:
    
        r5 = ((n0.C1131i) r2.first()).f12759e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = new a6.C0433h();
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if ((r12 instanceof n0.C1144v) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        o6.j.b(r5);
        r5 = r5.f12814f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r7 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r7.hasPrevious() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r8 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (o6.j.a(((n0.C1131i) r8).f12759e, r5) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r8 = (n0.C1131i) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r8 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        r8 = n0.C1118H.a(r0, r5, r13, h(), r11.f13894n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r2.addFirst(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r4.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000b, code lost:
    
        if (r2 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (((n0.C1131i) r4.last()).f12759e != r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        n(r11, (n0.C1131i) r4.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r5 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r5 != r12) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r2.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        if (r5 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (c(r5.f12813e.f13342a, r5) == r5) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r5 = r5.f12814f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        if (r5 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r4.isEmpty() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        if (r13 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r13.isEmpty() != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        r8 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        if (r8.hasPrevious() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r9 = r8.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (o6.j.a(((n0.C1131i) r9).f12759e, r5) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        r9 = (n0.C1131i) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dd, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        r9 = n0.C1118H.a(r0, r5, r5.g(r7), h(), r11.f13894n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ed, code lost:
    
        r2.addFirst(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if ((((n0.C1131i) r4.last()).f12759e instanceof n0.InterfaceC1127e) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f5, code lost:
    
        if (r2.isEmpty() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
    
        r1 = ((n0.C1131i) r2.first()).f12759e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0104, code lost:
    
        if (r4.isEmpty() != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0110, code lost:
    
        if ((((n0.C1131i) r4.last()).f12759e instanceof n0.C1144v) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0112, code lost:
    
        r3 = ((n0.C1131i) r4.last()).f12759e;
        o6.j.c(r3, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012f, code lost:
    
        if (((t.k) ((n0.C1144v) r3).j.f4115c).b(r1.f12813e.f13342a) != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0131, code lost:
    
        n(r11, (n0.C1131i) r4.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013f, code lost:
    
        if (r4.isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0141, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0149, code lost:
    
        r1 = (n0.C1131i) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014b, code lost:
    
        if (r1 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (l(((n0.C1131i) r4.last()).f12759e.f12813e.f13342a, true, false) != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0151, code lost:
    
        if (r2.isEmpty() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        r1 = (n0.C1131i) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0155, code lost:
    
        r1 = r2.f7762e[r2.f7761d];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015d, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015f, code lost:
    
        r1 = r1.f12759e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0169, code lost:
    
        if (o6.j.a(r1, r11.f13885c) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016b, code lost:
    
        r15 = r15.listIterator(r15.size());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AbstractC1143u abstractC1143u, Bundle bundle, C1131i c1131i, List list) {
        o oVar = this.f13883a.f12820c;
        AbstractC1143u abstractC1143u2 = c1131i.f12759e;
        boolean z8 = abstractC1143u2 instanceof InterfaceC1127e;
        C0433h c0433h = this.f13888f;
    }

    public final boolean b() {
        C0433h c0433h;
        while (true) {
            c0433h = this.f13888f;
            if (c0433h.isEmpty() || !(((C1131i) c0433h.last()).f12759e instanceof C1144v)) {
                break;
            }
            n(this, (C1131i) c0433h.last());
        }
        C1131i c1131i = (C1131i) c0433h.l();
        ArrayList arrayList = this.f13904x;
        if (c1131i != null) {
            arrayList.add(c1131i);
        }
        this.f13903w++;
        s();
        int i4 = this.f13903w - 1;
        this.f13903w = i4;
        if (i4 == 0) {
            ArrayList S02 = AbstractC0436k.S0(arrayList);
            arrayList.clear();
            Iterator it = S02.iterator();
            while (it.hasNext()) {
                C1131i c1131i2 = (C1131i) it.next();
                Iterator it2 = this.f13895o.iterator();
                if (!it2.hasNext()) {
                    this.f13905y.t(c1131i2);
                } else {
                    if (it2.next() == null) {
                        AbstractC1143u abstractC1143u = c1131i2.f12759e;
                        c1131i2.k.b();
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
            ArrayList S03 = AbstractC0436k.S0(c0433h);
            i0 i0Var = this.f13889g;
            i0Var.getClass();
            i0Var.h(null, S03);
            ArrayList o7 = o();
            i0 i0Var2 = this.f13890h;
            i0Var2.getClass();
            i0Var2.h(null, o7);
        }
        if (c1131i != null) {
            return true;
        }
        return false;
    }

    public final AbstractC1143u c(int i4, AbstractC1143u abstractC1143u) {
        AbstractC1143u abstractC1143u2;
        C1144v c1144v = this.f13885c;
        if (c1144v == null) {
            return null;
        }
        if (c1144v.f12813e.f13342a == i4) {
            if (abstractC1143u != null) {
                if (j.a(c1144v, abstractC1143u) && abstractC1143u.f12814f == null) {
                    return this.f13885c;
                }
            } else {
                return c1144v;
            }
        }
        C1131i c1131i = (C1131i) this.f13888f.l();
        if (c1131i == null || (abstractC1143u2 = c1131i.f12759e) == null) {
            abstractC1143u2 = this.f13885c;
            j.b(abstractC1143u2);
        }
        return d(i4, abstractC1143u2, abstractC1143u, false);
    }

    public final C1131i e(int i4) {
        Object obj;
        C0433h c0433h = this.f13888f;
        ListIterator<E> listIterator = c0433h.listIterator(c0433h.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((C1131i) obj).f12759e.f12813e.f13342a == i4) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1131i c1131i = (C1131i) obj;
        if (c1131i != null) {
            return c1131i;
        }
        StringBuilder j = AbstractC1149a.j(i4, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        j.append(f());
        throw new IllegalArgumentException(j.toString().toString());
    }

    public final AbstractC1143u f() {
        C1131i c1131i = (C1131i) this.f13888f.l();
        if (c1131i != null) {
            return c1131i.f12759e;
        }
        return null;
    }

    public final C1144v g() {
        C1144v c1144v = this.f13885c;
        if (c1144v != null) {
            j.c(c1144v, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return c1144v;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final EnumC0504o h() {
        if (this.f13893m == null) {
            return EnumC0504o.f8848f;
        }
        return this.f13896p;
    }

    public final C1144v i() {
        AbstractC1143u abstractC1143u;
        C1144v c1144v;
        C1131i c1131i = (C1131i) this.f13888f.l();
        if (c1131i == null || (abstractC1143u = c1131i.f12759e) == null) {
            abstractC1143u = this.f13885c;
            j.b(abstractC1143u);
        }
        if (abstractC1143u instanceof C1144v) {
            c1144v = (C1144v) abstractC1143u;
        } else {
            c1144v = null;
        }
        if (c1144v == null) {
            C1144v c1144v2 = abstractC1143u.f12814f;
            j.b(c1144v2);
            return c1144v2;
        }
        return c1144v;
    }

    public final void j(C1131i c1131i, C1131i c1131i2) {
        this.f13891i.put(c1131i, c1131i2);
        LinkedHashMap linkedHashMap = this.j;
        if (linkedHashMap.get(c1131i2) == null) {
            linkedHashMap.put(c1131i2, new C1345a());
        }
        Object obj = linkedHashMap.get(c1131i2);
        j.b(obj);
        ((C1345a) obj).f13870a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        if (r13.equals(r0) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        r0 = new a6.C0433h();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
    
        if (a6.AbstractC0437l.W(r12) < r14) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0110, code lost:
    
        r4 = (n0.C1131i) a6.q.h0(r12);
        r(r4);
        r24 = r1;
        r15 = new n0.C1131i(r4.f12758d, r4.f12759e, r4.f12759e.g(r27), r4.f12761g, r4.f12762h, r4.f12763i, r4.j);
        r1 = r4.f12761g;
        r8 = r15.k;
        r8.getClass();
        o6.j.e(r1, "<set-?>");
        r8.f1810f = r1;
        r1 = (androidx.lifecycle.EnumC0504o) r4.k.f1814l;
        o6.j.e(r1, "maxState");
        r8.f1814l = r1;
        r8.d();
        r0.addFirst(r15);
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0165, code lost:
    
        r24 = r1;
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016f, code lost:
    
        if (r1.hasNext() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0171, code lost:
    
        r4 = (n0.C1131i) r1.next();
        r5 = r4.f12759e.f12814f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        if (r5 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
    
        j(r4, e(r5.f12813e.f13342a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0188, code lost:
    
        r12.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0196, code lost:
    
        r1 = (n0.C1131i) r0.next();
        r11.b(r1.f12759e.f12812d).f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a8, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0103, code lost:
    
        if (r0.f13342a == r4.f12813e.f13342a) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f0 A[LOOP:1: B:19:0x01ea->B:21:0x01f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [o6.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(AbstractC1143u abstractC1143u, Bundle bundle, C1148z c1148z) {
        boolean z8;
        r rVar;
        boolean z9;
        r rVar2;
        ListIterator listIterator;
        int i4;
        Iterator it;
        j.e(abstractC1143u, "node");
        C1207p c1207p = abstractC1143u.f12813e;
        LinkedHashMap linkedHashMap = this.f13899s;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((C1134l) it2.next()).f12770d = true;
        }
        ?? obj = new Object();
        if (c1148z != null) {
            boolean z10 = c1148z.f12833e;
            boolean z11 = c1148z.f12832d;
            int i8 = c1148z.f12831c;
            if (i8 != -1) {
                z8 = l(i8, z11, z10);
                Bundle g8 = abstractC1143u.g(bundle);
                if (c1148z != null && c1148z.f12830b) {
                    if (this.k.containsKey(Integer.valueOf(c1207p.f13342a))) {
                        obj.f13639d = p(c1207p.f13342a, g8, c1148z);
                        z9 = false;
                        rVar2 = obj;
                        this.f13884b.a();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((C1134l) it.next()).f12770d = false;
                        }
                        if (z8 && !rVar2.f13639d && !z9) {
                            s();
                            return;
                        } else {
                            b();
                        }
                    }
                }
                C1121K c1121k = this.f13898r;
                if (c1148z != null && c1148z.f12829a) {
                    C0433h c0433h = this.f13888f;
                    C1131i c1131i = (C1131i) c0433h.l();
                    listIterator = c0433h.listIterator(c0433h.g());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            if (((C1131i) listIterator.previous()).f12759e == abstractC1143u) {
                                i4 = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 != -1) {
                        if (abstractC1143u instanceof C1144v) {
                            int i9 = C1144v.k;
                            List Y = m.Y(m.W(m.T((C1144v) abstractC1143u, new H7.o(27)), new C1234e(6)));
                            if (c0433h.f7763f - i4 == Y.size()) {
                                List subList = c0433h.subList(i4, c0433h.f7763f);
                                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(subList, 10));
                                Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(Integer.valueOf(((C1131i) it3.next()).f12759e.f12813e.f13342a));
                                }
                            }
                        } else if (c1131i != null) {
                            AbstractC1143u abstractC1143u2 = c1131i.f12759e;
                            if (abstractC1143u2 != null) {
                            }
                        }
                        if (!z9) {
                            C1131i a3 = C1118H.a(this.f13883a.f12820c, abstractC1143u, g8, h(), this.f13894n);
                            AbstractC1120J b4 = c1121k.b(abstractC1143u.f12812d);
                            List y4 = E2.d.y(a3);
                            r rVar3 = rVar;
                            this.f13900t = new i3.f(rVar3, this, abstractC1143u, g8, 4);
                            b4.d(y4, c1148z);
                            this.f13900t = null;
                            rVar2 = rVar3;
                        } else {
                            rVar2 = rVar;
                        }
                        this.f13884b.a();
                        it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                        }
                        if (z8) {
                        }
                        b();
                    }
                }
                rVar = obj;
                z9 = false;
                if (!z9) {
                }
                this.f13884b.a();
                it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                }
                if (z8) {
                }
                b();
            }
        }
        z8 = false;
        Bundle g82 = abstractC1143u.g(bundle);
        if (c1148z != null) {
            if (this.k.containsKey(Integer.valueOf(c1207p.f13342a))) {
            }
        }
        C1121K c1121k2 = this.f13898r;
        if (c1148z != null) {
            C0433h c0433h2 = this.f13888f;
            C1131i c1131i2 = (C1131i) c0433h2.l();
            listIterator = c0433h2.listIterator(c0433h2.g());
            while (true) {
                if (!listIterator.hasPrevious()) {
                }
            }
            if (i4 != -1) {
            }
        }
        rVar = obj;
        z9 = false;
        if (!z9) {
        }
        this.f13884b.a();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z8) {
        }
        b();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [o6.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [o6.r, java.lang.Object] */
    public final boolean l(int i4, boolean z8, boolean z9) {
        AbstractC1143u abstractC1143u;
        C1350f c1350f;
        boolean z10;
        Object obj;
        String str;
        C0433h c0433h = this.f13888f;
        final int i8 = 0;
        if (c0433h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC0436k.E0(c0433h).iterator();
        while (true) {
            if (it.hasNext()) {
                abstractC1143u = ((C1131i) it.next()).f12759e;
                String str2 = abstractC1143u.f12812d;
                C1207p c1207p = abstractC1143u.f12813e;
                AbstractC1120J b4 = this.f13898r.b(str2);
                if (z8 || c1207p.f13342a != i4) {
                    arrayList.add(b4);
                }
                if (c1207p.f13342a == i4) {
                    break;
                }
            } else {
                abstractC1143u = null;
                break;
            }
        }
        if (abstractC1143u == null) {
            int i9 = AbstractC1143u.f12811i;
            String str3 = "Ignoring popBackStack to destination " + AbstractC0837b.j(this.f13883a.f12820c, i4) + " as it was not found on the current back stack";
            j.e(str3, "message");
            Log.i("NavController", str3);
            return false;
        }
        ?? obj2 = new Object();
        C0433h c0433h2 = new C0433h();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                AbstractC1120J abstractC1120J = (AbstractC1120J) it2.next();
                ?? obj3 = new Object();
                C1131i c1131i = (C1131i) c0433h.last();
                c1350f = this;
                z10 = z9;
                C1347c c1347c = new C1347c(obj3, obj2, c1350f, z10, c0433h2);
                j.e(abstractC1120J, "navigator");
                j.e(c1131i, "popUpTo");
                c1350f.f13901u = c1347c;
                abstractC1120J.i(c1131i, z10);
                c1350f.f13901u = null;
                if (!obj3.f13639d) {
                    break;
                }
                z9 = z10;
            } else {
                c1350f = this;
                z10 = z9;
                break;
            }
        }
        if (z10) {
            LinkedHashMap linkedHashMap = c1350f.k;
            if (!z8) {
                H7.f fVar = new H7.f(new H7.j(m.T(abstractC1143u, new C1234e(4)), new InterfaceC1163b(this) { // from class: q0.d

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ C1350f f13877e;

                    {
                        this.f13877e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj4) {
                        boolean containsKey;
                        AbstractC1143u abstractC1143u2 = (AbstractC1143u) obj4;
                        switch (i8) {
                            case 0:
                                j.e(abstractC1143u2, "destination");
                                containsKey = this.f13877e.k.containsKey(Integer.valueOf(abstractC1143u2.f12813e.f13342a));
                                break;
                            default:
                                j.e(abstractC1143u2, "destination");
                                containsKey = this.f13877e.k.containsKey(Integer.valueOf(abstractC1143u2.f12813e.f13342a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }));
                while (fVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((AbstractC1143u) fVar.next()).f12813e.f13342a);
                    if (c0433h2.isEmpty()) {
                        obj = null;
                    } else {
                        obj = c0433h2.f7762e[c0433h2.f7761d];
                    }
                    C1132j c1132j = (C1132j) obj;
                    if (c1132j != null) {
                        str = (String) c1132j.f12764a.f4114b;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put(valueOf, str);
                }
            }
            if (!c0433h2.isEmpty()) {
                Y y4 = ((C1132j) c0433h2.first()).f12764a;
                final int i10 = 1;
                H7.f fVar2 = new H7.f(new H7.j(m.T(c(y4.f4113a, null), new C1234e(5)), new InterfaceC1163b(this) { // from class: q0.d

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ C1350f f13877e;

                    {
                        this.f13877e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj4) {
                        boolean containsKey;
                        AbstractC1143u abstractC1143u2 = (AbstractC1143u) obj4;
                        switch (i10) {
                            case 0:
                                j.e(abstractC1143u2, "destination");
                                containsKey = this.f13877e.k.containsKey(Integer.valueOf(abstractC1143u2.f12813e.f13342a));
                                break;
                            default:
                                j.e(abstractC1143u2, "destination");
                                containsKey = this.f13877e.k.containsKey(Integer.valueOf(abstractC1143u2.f12813e.f13342a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }));
                while (fVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((AbstractC1143u) fVar2.next()).f12813e.f13342a), (String) y4.f4114b);
                }
                if (linkedHashMap.values().contains((String) y4.f4114b)) {
                    c1350f.f13892l.put((String) y4.f4114b, c0433h2);
                }
            }
        }
        c1350f.f13884b.a();
        return obj2.f13639d;
    }

    public final void m(C1131i c1131i, boolean z8, C0433h c0433h) {
        C1135m c1135m;
        P p8;
        Set set;
        j.e(c1131i, "popUpTo");
        C0433h c0433h2 = this.f13888f;
        C1131i c1131i2 = (C1131i) c0433h2.last();
        if (j.a(c1131i2, c1131i)) {
            q.h0(c0433h2);
            C1134l c1134l = (C1134l) this.f13899s.get(this.f13898r.b(c1131i2.f12759e.f12812d));
            boolean z9 = true;
            if ((c1134l == null || (p8 = c1134l.f12772f) == null || (set = (Set) p8.f4088d.f()) == null || !set.contains(c1131i2)) && !this.j.containsKey(c1131i2)) {
                z9 = false;
            }
            EnumC0504o enumC0504o = ((C0512x) c1131i2.k.k).f8862d;
            EnumC0504o enumC0504o2 = EnumC0504o.f8848f;
            if (enumC0504o.compareTo(enumC0504o2) >= 0) {
                if (z8) {
                    c1131i2.a(enumC0504o2);
                    c0433h.addFirst(new C1132j(c1131i2));
                }
                if (!z9) {
                    c1131i2.a(EnumC0504o.f8846d);
                    r(c1131i2);
                } else {
                    c1131i2.a(enumC0504o2);
                }
            }
            if (!z8 && !z9 && (c1135m = this.f13894n) != null) {
                String str = c1131i2.f12763i;
                j.e(str, "backStackEntryId");
                e0 e0Var = (e0) c1135m.f12775b.remove(str);
                if (e0Var != null) {
                    e0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + c1131i.f12759e + ", which is not the top of the back stack (" + c1131i2.f12759e + ')').toString());
    }

    public final ArrayList o() {
        EnumC0504o enumC0504o;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f13899s.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0504o = EnumC0504o.f8849g;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((C1134l) it.next()).f12772f.f4088d.f();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C1131i c1131i = (C1131i) obj;
                if (!arrayList.contains(c1131i) && ((EnumC0504o) c1131i.k.f1814l).compareTo(enumC0504o) < 0) {
                    arrayList2.add(obj);
                }
            }
            q.f0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f13888f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C1131i c1131i2 = (C1131i) next;
            if (!arrayList.contains(c1131i2) && ((EnumC0504o) c1131i2.k.f1814l).compareTo(enumC0504o) >= 0) {
                arrayList3.add(next);
            }
        }
        q.f0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C1131i) next2).f12759e instanceof C1144v)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [o6.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, o6.s] */
    public final boolean p(int i4, final Bundle bundle, C1148z c1148z) {
        AbstractC1143u g8;
        String str;
        C1131i c1131i;
        AbstractC1143u abstractC1143u;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i4);
        LinkedHashMap linkedHashMap = this.k;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str2 = (String) linkedHashMap.get(Integer.valueOf(i4));
        Collection values = linkedHashMap.values();
        j.e(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (j.a((String) it.next(), str2)) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f13892l;
        y.a(linkedHashMap2);
        C0433h c0433h = (C0433h) linkedHashMap2.remove(str2);
        o oVar = this.f13883a.f12820c;
        final ArrayList arrayList = new ArrayList();
        C1131i c1131i2 = (C1131i) this.f13888f.l();
        if (c1131i2 == null || (g8 = c1131i2.f12759e) == null) {
            g8 = g();
        }
        if (c0433h != null) {
            Iterator it2 = c0433h.iterator();
            while (it2.hasNext()) {
                C1132j c1132j = (C1132j) it2.next();
                Y y4 = c1132j.f12764a;
                Y y5 = c1132j.f12764a;
                AbstractC1143u d2 = d(y4.f4113a, g8, null, true);
                if (d2 != null) {
                    EnumC0504o h8 = h();
                    C1135m c1135m = this.f13894n;
                    j.e(oVar, "context");
                    j.e(h8, "hostLifecycleState");
                    Bundle bundle3 = (Bundle) y5.f4115c;
                    if (bundle3 != null) {
                        bundle3.setClassLoader(oVar.f9402a.getClassLoader());
                        bundle2 = bundle3;
                    } else {
                        bundle2 = null;
                    }
                    String str3 = (String) y5.f4114b;
                    Bundle bundle4 = (Bundle) y5.f4116d;
                    j.e(str3, "id");
                    arrayList.add(new C1131i(oVar, d2, bundle2, h8, c1135m, str3, bundle4));
                    g8 = d2;
                } else {
                    int i8 = AbstractC1143u.f12811i;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC0837b.j(oVar, y5.f4113a) + " cannot be found from the current destination " + g8).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((C1131i) next).f12759e instanceof C1144v)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C1131i c1131i3 = (C1131i) it4.next();
            List list = (List) AbstractC0436k.y0(arrayList2);
            if (list != null && (c1131i = (C1131i) AbstractC0436k.x0(list)) != null && (abstractC1143u = c1131i.f12759e) != null) {
                str = abstractC1143u.f12812d;
            } else {
                str = null;
            }
            if (j.a(str, c1131i3.f12759e.f12812d)) {
                list.add(c1131i3);
            } else {
                arrayList2.add(AbstractC0437l.Z(c1131i3));
            }
        }
        final ?? obj = new Object();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            AbstractC1120J b4 = this.f13898r.b(((C1131i) AbstractC0436k.p0(list2)).f12759e.f12812d);
            final ?? obj2 = new Object();
            this.f13900t = new InterfaceC1163b() { // from class: q0.e
                @Override // n6.InterfaceC1163b
                public final Object m(Object obj3) {
                    List list3;
                    C1131i c1131i4 = (C1131i) obj3;
                    j.e(c1131i4, "entry");
                    r.this.f13639d = true;
                    ArrayList arrayList4 = arrayList;
                    int indexOf = arrayList4.indexOf(c1131i4);
                    if (indexOf != -1) {
                        o6.s sVar = obj2;
                        int i9 = indexOf + 1;
                        list3 = arrayList4.subList(sVar.f13640d, i9);
                        sVar.f13640d = i9;
                    } else {
                        list3 = s.f7766d;
                    }
                    this.a(c1131i4.f12759e, bundle, c1131i4, list3);
                    return Z5.y.f7506a;
                }
            };
            b4.d(list2, c1148z);
            this.f13900t = null;
        }
        return obj.f13639d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x028d  */
    /* JADX WARN: Type inference failed for: r20v1, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v16, types: [n0.v, n0.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(C1144v c1144v, Bundle bundle) {
        boolean z8;
        C1121K c1121k;
        String str;
        Intent intent;
        int[] intArray;
        ArrayList arrayList;
        Bundle bundle2;
        int[] iArr;
        C1142t o7;
        int[] iArr2;
        int length;
        int i4;
        String str2;
        boolean z9;
        AbstractC1143u n3;
        C1144v c1144v2;
        int i8;
        Bundle bundle3;
        AbstractC1143u n8;
        C1144v c1144v3;
        Y y4 = c1144v.j;
        C0433h c0433h = this.f13888f;
        if (!c0433h.isEmpty() && h() == EnumC0504o.f8846d) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        boolean z10 = true;
        if (!j.a(this.f13885c, c1144v)) {
            C1144v c1144v4 = this.f13885c;
            LinkedHashMap linkedHashMap = this.f13899s;
            AbstractC1143u abstractC1143u = null;
            if (c1144v4 != null) {
                Iterator it = new ArrayList(this.k.keySet()).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    j.b(num);
                    int intValue = num.intValue();
                    Iterator it2 = linkedHashMap.values().iterator();
                    while (it2.hasNext()) {
                        ((C1134l) it2.next()).f12770d = true;
                    }
                    C1111A c1111a = new C1111A();
                    c1111a.f12715c = true;
                    boolean z11 = c1111a.f12714b;
                    boolean z12 = c1111a.f12715c;
                    int i9 = c1111a.f12716d;
                    boolean z13 = c1111a.f12717e;
                    C0267o c0267o = c1111a.f12713a;
                    boolean p8 = p(intValue, null, new C1148z(z11, z12, i9, false, z13, c0267o.f4298a, c0267o.f4299b, -1, -1));
                    Iterator it3 = linkedHashMap.values().iterator();
                    while (it3.hasNext()) {
                        ((C1134l) it3.next()).f12770d = false;
                    }
                    if (p8) {
                        l(intValue, true, false);
                    }
                }
                l(c1144v4.f12813e.f13342a, true, false);
            }
            this.f13885c = c1144v;
            C1146x c1146x = this.f13883a;
            C1350f c1350f = c1146x.f12819b;
            o oVar = c1146x.f12820c;
            Bundle bundle4 = this.f13886d;
            C1121K c1121k2 = this.f13898r;
            if (bundle4 != null && bundle4.containsKey("android-support-nav:controller:navigatorState:names")) {
                ArrayList<String> stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names");
                if (stringArrayList != null) {
                    for (String str3 : stringArrayList) {
                        AbstractC1120J b4 = c1121k2.b(str3);
                        if (bundle4.containsKey(str3)) {
                            Bundle bundle5 = bundle4.getBundle(str3);
                            if (bundle5 != null) {
                                b4.g(bundle5);
                            } else {
                                AbstractC1492c.z(str3);
                                throw null;
                            }
                        }
                    }
                } else {
                    AbstractC1492c.z("android-support-nav:controller:navigatorState:names");
                    throw null;
                }
            }
            Bundle[] bundleArr = this.f13887e;
            String str4 = " cannot be found from the current destination ";
            if (bundleArr != null) {
                int length2 = bundleArr.length;
                int i10 = 0;
                while (i10 < length2) {
                    Bundle bundle6 = bundleArr[i10];
                    j.e(bundle6, "state");
                    bundle6.setClassLoader(C1132j.class.getClassLoader());
                    boolean z14 = z10;
                    String string = bundle6.getString("nav-entry-state:id");
                    if (string != null) {
                        int y5 = X.y("nav-entry-state:destination-id", bundle6);
                        int i11 = length2;
                        Bundle bundle7 = bundle6.getBundle("nav-entry-state:args");
                        if (bundle7 != null) {
                            Bundle bundle8 = bundle6.getBundle("nav-entry-state:saved-state");
                            if (bundle8 != null) {
                                String str5 = str4;
                                AbstractC1143u c6 = c(y5, abstractC1143u);
                                if (c6 != null) {
                                    int i12 = i10;
                                    EnumC0504o h8 = h();
                                    C1135m c1135m = this.f13894n;
                                    AbstractC1143u abstractC1143u2 = abstractC1143u;
                                    j.e(oVar, "context");
                                    j.e(h8, "hostLifecycleState");
                                    bundle7.setClassLoader(oVar.f9402a.getClassLoader());
                                    C1121K c1121k3 = c1121k2;
                                    Bundle[] bundleArr2 = bundleArr;
                                    C1131i c1131i = new C1131i(oVar, c6, bundle7, h8, c1135m, string, bundle8);
                                    AbstractC1120J b9 = c1121k3.b(c6.f12812d);
                                    Object obj = linkedHashMap.get(b9);
                                    if (obj == null) {
                                        obj = new C1134l(c1146x, b9);
                                        linkedHashMap.put(b9, obj);
                                    }
                                    c0433h.addLast(c1131i);
                                    ((C1134l) obj).a(c1131i);
                                    C1144v c1144v5 = c1131i.f12759e.f12814f;
                                    if (c1144v5 != null) {
                                        j(c1131i, e(c1144v5.f12813e.f13342a));
                                    }
                                    i10 = i12 + 1;
                                    c1121k2 = c1121k3;
                                    length2 = i11;
                                    str4 = str5;
                                    z10 = z14;
                                    bundleArr = bundleArr2;
                                    abstractC1143u = abstractC1143u2;
                                } else {
                                    int i13 = AbstractC1143u.f12811i;
                                    StringBuilder s8 = A.j.s("Restoring the Navigation back stack failed: destination ", AbstractC0837b.j(oVar, y5), str5);
                                    s8.append(f());
                                    throw new IllegalStateException(s8.toString());
                                }
                            } else {
                                ?? r20 = abstractC1143u;
                                AbstractC1492c.z("nav-entry-state:saved-state");
                                throw r20;
                            }
                        } else {
                            ?? r202 = abstractC1143u;
                            AbstractC1492c.z("nav-entry-state:args");
                            throw r202;
                        }
                    } else {
                        ?? r203 = abstractC1143u;
                        AbstractC1492c.z("nav-entry-state:id");
                        throw r203;
                    }
                }
                z8 = z10;
                ?? r204 = abstractC1143u;
                c1121k = c1121k2;
                str = str4;
                this.f13884b.a();
                this.f13887e = r204;
            } else {
                z8 = true;
                c1121k = c1121k2;
                str = " cannot be found from the current destination ";
            }
            Collection values = x.S0(c1121k.f12741a).values();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : values) {
                if (!((AbstractC1120J) obj2).f12739b) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                AbstractC1120J abstractC1120J = (AbstractC1120J) it4.next();
                Object obj3 = linkedHashMap.get(abstractC1120J);
                if (obj3 == null) {
                    j.e(abstractC1120J, "navigator");
                    obj3 = new C1134l(c1146x, abstractC1120J);
                    linkedHashMap.put(abstractC1120J, obj3);
                }
                abstractC1120J.e((C1134l) obj3);
            }
            if (this.f13885c != null && c0433h.isEmpty()) {
                Activity activity = c1146x.f12821d;
                if (!c1146x.f12822e && activity != null && (intent = activity.getIntent()) != null) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        try {
                            intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                        } catch (Exception e9) {
                            Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e9);
                        }
                        if (extras == null) {
                            arrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                        } else {
                            arrayList = null;
                        }
                        Bundle k = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                        if (extras == null) {
                            bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                        } else {
                            bundle2 = null;
                        }
                        if (bundle2 != null) {
                            k.putAll(bundle2);
                        }
                        if (intArray == null && intArray.length != 0) {
                            iArr = intArray;
                        } else {
                            ?? i14 = c1350f.i();
                            iArr = intArray;
                            o7 = i14.o(new R.g(intent.getData(), intent.getAction(), intent.getType(), 15), i14);
                            if (o7 != null) {
                                AbstractC1143u abstractC1143u3 = o7.f12805d;
                                int[] h9 = abstractC1143u3.h(null);
                                Bundle g8 = abstractC1143u3.g(o7.f12806e);
                                if (g8 != null) {
                                    k.putAll(g8);
                                }
                                iArr2 = h9;
                                arrayList = null;
                                if (iArr2 != null && iArr2.length != 0) {
                                    c1350f.getClass();
                                    C1144v c1144v6 = c1350f.f13885c;
                                    length = iArr2.length;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 >= length) {
                                            int i15 = iArr2[i4];
                                            if (i4 == 0) {
                                                C1144v c1144v7 = c1350f.f13885c;
                                                j.b(c1144v7);
                                                if (c1144v7.f12813e.f13342a == i15) {
                                                    n8 = c1350f.f13885c;
                                                } else {
                                                    n8 = null;
                                                }
                                            } else {
                                                j.b(c1144v6);
                                                n8 = c1144v6.n(i15);
                                            }
                                            if (n8 == null) {
                                                int i16 = AbstractC1143u.f12811i;
                                                str2 = AbstractC0837b.j(c1350f.f13883a.f12820c, i15);
                                                break;
                                            }
                                            if (i4 != iArr2.length - 1 && (n8 instanceof C1144v)) {
                                                while (true) {
                                                    c1144v3 = (C1144v) n8;
                                                    j.b(c1144v3);
                                                    Y y8 = c1144v3.j;
                                                    if (!(c1144v3.n(y8.f4113a) instanceof C1144v)) {
                                                        break;
                                                    } else {
                                                        n8 = c1144v3.n(y8.f4113a);
                                                    }
                                                }
                                                c1144v6 = c1144v3;
                                            }
                                            i4++;
                                        } else {
                                            str2 = null;
                                            break;
                                        }
                                    }
                                    if (str2 == null) {
                                        String str6 = "Could not find destination " + str2 + " in the navigation graph, ignoring the deep link from " + intent;
                                        j.e(str6, "message");
                                        Log.i("NavController", str6);
                                    } else {
                                        k.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        int length3 = iArr2.length;
                                        Bundle[] bundleArr3 = new Bundle[length3];
                                        for (int i17 = 0; i17 < length3; i17++) {
                                            Bundle k6 = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                                            k6.putAll(k);
                                            if (arrayList != null && (bundle3 = (Bundle) arrayList.get(i17)) != null) {
                                                k6.putAll(bundle3);
                                            }
                                            bundleArr3[i17] = k6;
                                        }
                                        int flags = intent.getFlags();
                                        int i18 = 268435456 & flags;
                                        if (i18 != 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            v vVar = new v(c1146x.f12818a);
                                            ComponentName component = intent.getComponent();
                                            if (component == null) {
                                                component = intent.resolveActivity(vVar.f1151e.getPackageManager());
                                            }
                                            if (component != null) {
                                                vVar.g(component);
                                            }
                                            vVar.f1150d.add(intent);
                                            vVar.h();
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                            return;
                                        }
                                        if (i18 != 0) {
                                            z9 = z8;
                                        } else {
                                            z9 = false;
                                        }
                                        if (z9) {
                                            if (!c1350f.f13888f.isEmpty()) {
                                                C1144v c1144v8 = c1350f.f13885c;
                                                j.b(c1144v8);
                                                i8 = 0;
                                                c1350f.l(c1144v8.f12813e.f13342a, z8, false);
                                            } else {
                                                i8 = 0;
                                            }
                                            while (i8 < iArr2.length) {
                                                int i19 = iArr2[i8];
                                                int i20 = i8 + 1;
                                                Bundle bundle9 = bundleArr3[i8];
                                                AbstractC1143u c9 = c1350f.c(i19, null);
                                                if (c9 != null) {
                                                    M7.c cVar = new M7.c(c9, 13, c1146x);
                                                    C1111A c1111a2 = new C1111A();
                                                    cVar.m(c1111a2);
                                                    boolean z15 = c1111a2.f12714b;
                                                    boolean z16 = c1111a2.f12715c;
                                                    int i21 = c1111a2.f12716d;
                                                    boolean z17 = c1111a2.f12717e;
                                                    C0267o c0267o2 = c1111a2.f12713a;
                                                    c1350f.k(c9, bundle9, new C1148z(z15, z16, i21, false, z17, c0267o2.f4298a, c0267o2.f4299b, -1, -1));
                                                    i8 = i20;
                                                } else {
                                                    int i22 = AbstractC1143u.f12811i;
                                                    StringBuilder s9 = A.j.s("Deep Linking failed: destination ", AbstractC0837b.j(oVar, i19), str);
                                                    s9.append(c1350f.f());
                                                    throw new IllegalStateException(s9.toString());
                                                }
                                            }
                                            c1146x.f12822e = true;
                                            return;
                                        }
                                        C1144v c1144v9 = c1350f.f13885c;
                                        int length4 = iArr2.length;
                                        for (int i23 = 0; i23 < length4; i23++) {
                                            int i24 = iArr2[i23];
                                            Bundle bundle10 = bundleArr3[i23];
                                            if (i23 == 0) {
                                                n3 = c1350f.f13885c;
                                            } else {
                                                j.b(c1144v9);
                                                n3 = c1144v9.n(i24);
                                            }
                                            if (n3 != null) {
                                                if (i23 != iArr2.length - 1) {
                                                    if (n3 instanceof C1144v) {
                                                        while (true) {
                                                            c1144v2 = (C1144v) n3;
                                                            j.b(c1144v2);
                                                            Y y9 = c1144v2.j;
                                                            if (!(c1144v2.n(y9.f4113a) instanceof C1144v)) {
                                                                break;
                                                            } else {
                                                                n3 = c1144v2.n(y9.f4113a);
                                                            }
                                                        }
                                                        c1144v9 = c1144v2;
                                                    }
                                                } else {
                                                    C1144v c1144v10 = c1350f.f13885c;
                                                    j.b(c1144v10);
                                                    c1350f.k(n3, bundle10, new C1148z(false, false, c1144v10.f12813e.f13342a, true, false, 0, 0, -1, -1));
                                                }
                                            } else {
                                                int i25 = AbstractC1143u.f12811i;
                                                throw new IllegalStateException("Deep Linking failed: destination " + AbstractC0837b.j(oVar, i24) + " cannot be found in graph " + c1144v9);
                                            }
                                        }
                                        c1146x.f12822e = true;
                                        return;
                                    }
                                }
                            }
                        }
                        iArr2 = iArr;
                        if (iArr2 != null) {
                            c1350f.getClass();
                            C1144v c1144v62 = c1350f.f13885c;
                            length = iArr2.length;
                            i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                }
                                i4++;
                            }
                            if (str2 == null) {
                            }
                        }
                    }
                    intArray = null;
                    if (extras == null) {
                    }
                    Bundle k8 = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                    if (extras == null) {
                    }
                    if (bundle2 != null) {
                    }
                    if (intArray == null) {
                    }
                    ?? i142 = c1350f.i();
                    iArr = intArray;
                    o7 = i142.o(new R.g(intent.getData(), intent.getAction(), intent.getType(), 15), i142);
                    if (o7 != null) {
                    }
                    iArr2 = iArr;
                    if (iArr2 != null) {
                    }
                }
                C1144v c1144v11 = this.f13885c;
                j.b(c1144v11);
                k(c1144v11, bundle, null);
                return;
            }
            b();
            return;
        }
        int e10 = ((k) y4.f4115c).e();
        for (int i26 = 0; i26 < e10; i26++) {
            AbstractC1143u abstractC1143u4 = (AbstractC1143u) ((k) y4.f4115c).f(i26);
            C1144v c1144v12 = this.f13885c;
            j.b(c1144v12);
            int c10 = ((k) c1144v12.j.f4115c).c(i26);
            C1144v c1144v13 = this.f13885c;
            j.b(c1144v13);
            k kVar = (k) c1144v13.j.f4115c;
            if (kVar.f14671d) {
                t.h.a(kVar);
            }
            int a3 = AbstractC1595a.a(kVar.f14674g, c10, kVar.f14672e);
            if (a3 >= 0) {
                Object[] objArr = kVar.f14673f;
                Object obj4 = objArr[a3];
                objArr[a3] = abstractC1143u4;
            }
        }
        Iterator it5 = c0433h.iterator();
        while (it5.hasNext()) {
            C1131i c1131i2 = (C1131i) it5.next();
            int i27 = AbstractC1143u.f12811i;
            AbstractC1143u abstractC1143u5 = c1131i2.f12759e;
            j.e(abstractC1143u5, "<this>");
            i iVar = new i(1, m.Y(m.T(abstractC1143u5, new H7.o(26))));
            AbstractC1143u abstractC1143u6 = this.f13885c;
            j.b(abstractC1143u6);
            Iterator it6 = iVar.iterator();
            while (true) {
                ListIterator listIterator = ((a6.y) it6).f7772e;
                if (listIterator.hasPrevious()) {
                    AbstractC1143u abstractC1143u7 = (AbstractC1143u) listIterator.previous();
                    if (!j.a(abstractC1143u7, this.f13885c) || !j.a(abstractC1143u6, c1144v)) {
                        if (abstractC1143u6 instanceof C1144v) {
                            abstractC1143u6 = ((C1144v) abstractC1143u6).n(abstractC1143u7.f12813e.f13342a);
                            j.b(abstractC1143u6);
                        }
                    }
                }
            }
            j.e(abstractC1143u6, "<set-?>");
            c1131i2.f12759e = abstractC1143u6;
        }
    }

    public final void r(C1131i c1131i) {
        Integer num;
        j.e(c1131i, "child");
        C1131i c1131i2 = (C1131i) this.f13891i.remove(c1131i);
        if (c1131i2 != null) {
            LinkedHashMap linkedHashMap = this.j;
            C1345a c1345a = (C1345a) linkedHashMap.get(c1131i2);
            if (c1345a != null) {
                num = Integer.valueOf(c1345a.f13870a.decrementAndGet());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                C1134l c1134l = (C1134l) this.f13899s.get(this.f13898r.b(c1131i2.f12759e.f12812d));
                if (c1134l != null) {
                    c1134l.c(c1131i2);
                }
                linkedHashMap.remove(c1131i2);
            }
        }
    }

    public final void s() {
        Boolean bool;
        C1345a c1345a;
        P p8;
        Set set;
        ArrayList S02 = AbstractC0436k.S0(this.f13888f);
        if (!S02.isEmpty()) {
            ArrayList Z8 = AbstractC0437l.Z(((C1131i) AbstractC0436k.x0(S02)).f12759e);
            ArrayList arrayList = new ArrayList();
            if (AbstractC0436k.x0(Z8) instanceof InterfaceC1127e) {
                Iterator it = AbstractC0436k.E0(S02).iterator();
                while (it.hasNext()) {
                    AbstractC1143u abstractC1143u = ((C1131i) it.next()).f12759e;
                    arrayList.add(abstractC1143u);
                    if (!(abstractC1143u instanceof InterfaceC1127e) && !(abstractC1143u instanceof C1144v)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (C1131i c1131i : AbstractC0436k.E0(S02)) {
                EnumC0504o enumC0504o = (EnumC0504o) c1131i.k.f1814l;
                AbstractC1143u abstractC1143u2 = c1131i.f12759e;
                AbstractC1143u abstractC1143u3 = (AbstractC1143u) AbstractC0436k.r0(Z8);
                EnumC0504o enumC0504o2 = EnumC0504o.f8850h;
                EnumC0504o enumC0504o3 = EnumC0504o.f8849g;
                if (abstractC1143u3 != null && abstractC1143u3.f12813e.f13342a == abstractC1143u2.f12813e.f13342a) {
                    if (enumC0504o != enumC0504o2) {
                        C1134l c1134l = (C1134l) this.f13899s.get(this.f13898r.b(c1131i.f12759e.f12812d));
                        if (c1134l != null && (p8 = c1134l.f12772f) != null && (set = (Set) p8.f4088d.f()) != null) {
                            bool = Boolean.valueOf(set.contains(c1131i));
                        } else {
                            bool = null;
                        }
                        if (!j.a(bool, Boolean.TRUE) && ((c1345a = (C1345a) this.j.get(c1131i)) == null || c1345a.f13870a.get() != 0)) {
                            hashMap.put(c1131i, enumC0504o2);
                        } else {
                            hashMap.put(c1131i, enumC0504o3);
                        }
                    }
                    AbstractC1143u abstractC1143u4 = (AbstractC1143u) AbstractC0436k.r0(arrayList);
                    if (abstractC1143u4 != null && abstractC1143u4.f12813e.f13342a == abstractC1143u2.f12813e.f13342a) {
                        q.g0(arrayList);
                    }
                    q.g0(Z8);
                    C1144v c1144v = abstractC1143u2.f12814f;
                    if (c1144v != null) {
                        Z8.add(c1144v);
                    }
                } else if (!arrayList.isEmpty() && abstractC1143u2.f12813e.f13342a == ((AbstractC1143u) AbstractC0436k.p0(arrayList)).f12813e.f13342a) {
                    AbstractC1143u abstractC1143u5 = (AbstractC1143u) q.g0(arrayList);
                    if (enumC0504o == enumC0504o2) {
                        c1131i.a(enumC0504o3);
                    } else if (enumC0504o != enumC0504o3) {
                        hashMap.put(c1131i, enumC0504o3);
                    }
                    C1144v c1144v2 = abstractC1143u5.f12814f;
                    if (c1144v2 != null && !arrayList.contains(c1144v2)) {
                        arrayList.add(c1144v2);
                    }
                } else {
                    c1131i.a(EnumC0504o.f8848f);
                }
            }
            Iterator it2 = S02.iterator();
            while (it2.hasNext()) {
                C1131i c1131i2 = (C1131i) it2.next();
                EnumC0504o enumC0504o4 = (EnumC0504o) hashMap.get(c1131i2);
                if (enumC0504o4 != null) {
                    c1131i2.a(enumC0504o4);
                } else {
                    c1131i2.k.d();
                }
            }
        }
    }
}
