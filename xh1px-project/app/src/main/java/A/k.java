package A;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f90a;

    /* renamed from: b, reason: collision with root package name */
    public final n f91b;

    /* renamed from: c, reason: collision with root package name */
    public final m f92c;

    /* renamed from: d, reason: collision with root package name */
    public final l f93d;

    /* renamed from: e, reason: collision with root package name */
    public final o f94e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f95f;

    /* JADX WARN: Type inference failed for: r0v0, types: [A.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [A.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, A.l] */
    /* JADX WARN: Type inference failed for: r0v3, types: [A.o, java.lang.Object] */
    public k() {
        ?? obj = new Object();
        obj.f158a = 0;
        obj.f159b = 0;
        obj.f160c = 1.0f;
        obj.f161d = Float.NaN;
        this.f91b = obj;
        ?? obj2 = new Object();
        obj2.f154a = -1;
        obj2.f155b = -1;
        obj2.f156c = Float.NaN;
        obj2.f157d = Float.NaN;
        this.f92c = obj2;
        ?? obj3 = new Object();
        obj3.f120a = false;
        obj3.f126d = -1;
        obj3.f128e = -1;
        obj3.f130f = -1.0f;
        obj3.f132g = -1;
        obj3.f134h = -1;
        obj3.f136i = -1;
        obj3.j = -1;
        obj3.k = -1;
        obj3.f138l = -1;
        obj3.f139m = -1;
        obj3.f140n = -1;
        obj3.f141o = -1;
        obj3.f142p = -1;
        obj3.f143q = -1;
        obj3.f144r = -1;
        obj3.f145s = -1;
        obj3.f146t = 0.5f;
        obj3.f147u = 0.5f;
        obj3.f148v = null;
        obj3.f149w = -1;
        obj3.f150x = 0;
        obj3.f151y = 0.0f;
        obj3.f152z = -1;
        obj3.f96A = -1;
        obj3.f97B = -1;
        obj3.f98C = -1;
        obj3.f99D = -1;
        obj3.f100E = -1;
        obj3.f101F = -1;
        obj3.f102G = -1;
        obj3.f103H = -1;
        obj3.f104I = -1;
        obj3.f105J = -1;
        obj3.K = -1;
        obj3.f106L = -1;
        obj3.f107M = -1;
        obj3.f108N = -1;
        obj3.f109O = -1.0f;
        obj3.f110P = -1.0f;
        obj3.f111Q = 0;
        obj3.f112R = 0;
        obj3.f113S = 0;
        obj3.f114T = 0;
        obj3.f115U = -1;
        obj3.f116V = -1;
        obj3.f117W = -1;
        obj3.f118X = -1;
        obj3.Y = 1.0f;
        obj3.f119Z = 1.0f;
        obj3.f121a0 = -1;
        obj3.f123b0 = 0;
        obj3.f125c0 = -1;
        obj3.f133g0 = false;
        obj3.f135h0 = false;
        obj3.f137i0 = true;
        this.f93d = obj3;
        ?? obj4 = new Object();
        obj4.f163a = 0.0f;
        obj4.f164b = 0.0f;
        obj4.f165c = 0.0f;
        obj4.f166d = 1.0f;
        obj4.f167e = 1.0f;
        obj4.f168f = Float.NaN;
        obj4.f169g = Float.NaN;
        obj4.f170h = 0.0f;
        obj4.f171i = 0.0f;
        obj4.j = 0.0f;
        obj4.k = false;
        obj4.f172l = 0.0f;
        this.f94e = obj4;
        this.f95f = new HashMap();
    }

    public final void a(e eVar) {
        l lVar = this.f93d;
        eVar.f44d = lVar.f132g;
        eVar.f46e = lVar.f134h;
        eVar.f48f = lVar.f136i;
        eVar.f50g = lVar.j;
        eVar.f52h = lVar.k;
        eVar.f54i = lVar.f138l;
        eVar.j = lVar.f139m;
        eVar.k = lVar.f140n;
        eVar.f57l = lVar.f141o;
        eVar.f61p = lVar.f142p;
        eVar.f62q = lVar.f143q;
        eVar.f63r = lVar.f144r;
        eVar.f64s = lVar.f145s;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = lVar.f98C;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = lVar.f99D;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = lVar.f100E;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = lVar.f101F;
        eVar.f69x = lVar.f108N;
        eVar.f70y = lVar.f107M;
        eVar.f66u = lVar.f105J;
        eVar.f68w = lVar.f106L;
        eVar.f71z = lVar.f146t;
        eVar.f14A = lVar.f147u;
        eVar.f58m = lVar.f149w;
        eVar.f59n = lVar.f150x;
        eVar.f60o = lVar.f151y;
        eVar.f15B = lVar.f148v;
        eVar.f28P = lVar.f152z;
        eVar.f29Q = lVar.f96A;
        eVar.f18E = lVar.f109O;
        eVar.f17D = lVar.f110P;
        eVar.f20G = lVar.f112R;
        eVar.f19F = lVar.f111Q;
        eVar.f31S = lVar.f133g0;
        eVar.f32T = lVar.f135h0;
        eVar.f21H = lVar.f113S;
        eVar.f22I = lVar.f114T;
        eVar.f24L = lVar.f115U;
        eVar.f25M = lVar.f116V;
        eVar.f23J = lVar.f117W;
        eVar.K = lVar.f118X;
        eVar.f26N = lVar.Y;
        eVar.f27O = lVar.f119Z;
        eVar.f30R = lVar.f97B;
        eVar.f42c = lVar.f130f;
        eVar.f38a = lVar.f126d;
        eVar.f40b = lVar.f128e;
        ((ViewGroup.MarginLayoutParams) eVar).width = lVar.f122b;
        ((ViewGroup.MarginLayoutParams) eVar).height = lVar.f124c;
        String str = lVar.f131f0;
        if (str != null) {
            eVar.f33U = str;
        }
        eVar.setMarginStart(lVar.f103H);
        eVar.setMarginEnd(lVar.f102G);
        eVar.a();
    }

    public final Object clone() {
        k kVar = new k();
        l lVar = kVar.f93d;
        lVar.getClass();
        l lVar2 = this.f93d;
        lVar.f120a = lVar2.f120a;
        lVar.f122b = lVar2.f122b;
        lVar.f124c = lVar2.f124c;
        lVar.f126d = lVar2.f126d;
        lVar.f128e = lVar2.f128e;
        lVar.f130f = lVar2.f130f;
        lVar.f132g = lVar2.f132g;
        lVar.f134h = lVar2.f134h;
        lVar.f136i = lVar2.f136i;
        lVar.j = lVar2.j;
        lVar.k = lVar2.k;
        lVar.f138l = lVar2.f138l;
        lVar.f139m = lVar2.f139m;
        lVar.f140n = lVar2.f140n;
        lVar.f141o = lVar2.f141o;
        lVar.f142p = lVar2.f142p;
        lVar.f143q = lVar2.f143q;
        lVar.f144r = lVar2.f144r;
        lVar.f145s = lVar2.f145s;
        lVar.f146t = lVar2.f146t;
        lVar.f147u = lVar2.f147u;
        lVar.f148v = lVar2.f148v;
        lVar.f149w = lVar2.f149w;
        lVar.f150x = lVar2.f150x;
        lVar.f151y = lVar2.f151y;
        lVar.f152z = lVar2.f152z;
        lVar.f96A = lVar2.f96A;
        lVar.f97B = lVar2.f97B;
        lVar.f98C = lVar2.f98C;
        lVar.f99D = lVar2.f99D;
        lVar.f100E = lVar2.f100E;
        lVar.f101F = lVar2.f101F;
        lVar.f102G = lVar2.f102G;
        lVar.f103H = lVar2.f103H;
        lVar.f104I = lVar2.f104I;
        lVar.f105J = lVar2.f105J;
        lVar.K = lVar2.K;
        lVar.f106L = lVar2.f106L;
        lVar.f107M = lVar2.f107M;
        lVar.f108N = lVar2.f108N;
        lVar.f109O = lVar2.f109O;
        lVar.f110P = lVar2.f110P;
        lVar.f111Q = lVar2.f111Q;
        lVar.f112R = lVar2.f112R;
        lVar.f113S = lVar2.f113S;
        lVar.f114T = lVar2.f114T;
        lVar.f115U = lVar2.f115U;
        lVar.f116V = lVar2.f116V;
        lVar.f117W = lVar2.f117W;
        lVar.f118X = lVar2.f118X;
        lVar.Y = lVar2.Y;
        lVar.f119Z = lVar2.f119Z;
        lVar.f121a0 = lVar2.f121a0;
        lVar.f123b0 = lVar2.f123b0;
        lVar.f125c0 = lVar2.f125c0;
        lVar.f131f0 = lVar2.f131f0;
        int[] iArr = lVar2.f127d0;
        if (iArr != null) {
            lVar.f127d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            lVar.f127d0 = null;
        }
        lVar.f129e0 = lVar2.f129e0;
        lVar.f133g0 = lVar2.f133g0;
        lVar.f135h0 = lVar2.f135h0;
        lVar.f137i0 = lVar2.f137i0;
        m mVar = kVar.f92c;
        mVar.getClass();
        m mVar2 = this.f92c;
        mVar2.getClass();
        mVar.f154a = mVar2.f154a;
        mVar.f155b = mVar2.f155b;
        mVar.f157d = mVar2.f157d;
        mVar.f156c = mVar2.f156c;
        n nVar = this.f91b;
        int i4 = nVar.f158a;
        n nVar2 = kVar.f91b;
        nVar2.f158a = i4;
        nVar2.f160c = nVar.f160c;
        nVar2.f161d = nVar.f161d;
        nVar2.f159b = nVar.f159b;
        o oVar = kVar.f94e;
        oVar.getClass();
        o oVar2 = this.f94e;
        oVar2.getClass();
        oVar.f163a = oVar2.f163a;
        oVar.f164b = oVar2.f164b;
        oVar.f165c = oVar2.f165c;
        oVar.f166d = oVar2.f166d;
        oVar.f167e = oVar2.f167e;
        oVar.f168f = oVar2.f168f;
        oVar.f169g = oVar2.f169g;
        oVar.f170h = oVar2.f170h;
        oVar.f171i = oVar2.f171i;
        oVar.j = oVar2.j;
        oVar.k = oVar2.k;
        oVar.f172l = oVar2.f172l;
        kVar.f90a = this.f90a;
        return kVar;
    }
}
