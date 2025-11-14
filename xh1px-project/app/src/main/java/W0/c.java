package W0;

import A.j;
import C.f;
import C1.e;
import C6.O;
import D4.C0040p;
import I7.v;
import L3.E;
import L3.I;
import O3.J;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import O7.L;
import P.C0258f;
import P.InterfaceC0255c;
import P.InterfaceC0260h;
import P.InterfaceC0268p;
import P.p0;
import P.t0;
import Q2.g;
import R3.r;
import S2.i;
import T3.x;
import T6.q;
import X.InterfaceC0339g;
import Y3.z;
import Z5.y;
import a0.C0408c;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import c7.C0587f;
import com.google.android.material.navigationrail.NavigationRailView;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f7.C0722b;
import f7.C0723c;
import g0.C0731A;
import i.AbstractC0862a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k0.AbstractC0948c;
import n6.InterfaceC1164c;
import o.p1;
import s3.AbstractC1492c;
import u6.AbstractC1638C;
import x5.p;
import x5.s;
import x5.t;

/* loaded from: classes.dex */
public final class c implements M0.a, s, InterfaceC0268p, InterfaceC0233f, InterfaceC0255c, i, InterfaceC0260h, O, InterfaceC0339g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6485d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6486e;

    public /* synthetic */ c(int i4, Object obj) {
        this.f6485d = i4;
        this.f6486e = obj;
    }

    public static String j(String str, b bVar, boolean z8) {
        String str2 = bVar.f6484d;
        if (z8) {
            str2 = ".temp".concat(str2);
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b4 : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b4)));
                }
                replaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return j.p("lottie_cache_", replaceAll, str2);
    }

    @Override // x5.s
    public t0 b(View view, t0 t0Var, t tVar) {
        boolean fitsSystemWindows;
        boolean fitsSystemWindows2;
        boolean fitsSystemWindows3;
        int i4;
        H.c f8 = t0Var.f4308a.f(519);
        NavigationRailView navigationRailView = (NavigationRailView) this.f6486e;
        Boolean bool = navigationRailView.k;
        if (bool != null) {
            fitsSystemWindows = bool.booleanValue();
        } else {
            WeakHashMap weakHashMap = P.O.f4214a;
            fitsSystemWindows = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows) {
            tVar.f16221b += f8.f1849b;
        }
        Boolean bool2 = navigationRailView.f10203l;
        if (bool2 != null) {
            fitsSystemWindows2 = bool2.booleanValue();
        } else {
            WeakHashMap weakHashMap2 = P.O.f4214a;
            fitsSystemWindows2 = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows2) {
            tVar.f16223d += f8.f1851d;
        }
        Boolean bool3 = navigationRailView.f10204m;
        if (bool3 != null) {
            fitsSystemWindows3 = bool3.booleanValue();
        } else {
            WeakHashMap weakHashMap3 = P.O.f4214a;
            fitsSystemWindows3 = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows3) {
            int i8 = tVar.f16220a;
            if (p.g(view)) {
                i4 = f8.f1850c;
            } else {
                i4 = f8.f1848a;
            }
            tVar.f16220a = i8 + i4;
        }
        int i9 = tVar.f16220a;
        int i10 = tVar.f16221b;
        int i11 = tVar.f16222c;
        int i12 = tVar.f16223d;
        WeakHashMap weakHashMap4 = P.O.f4214a;
        view.setPaddingRelative(i9, i10, i11, i12);
        return t0Var;
    }

    @Override // P.InterfaceC0255c
    public C0258f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f6486e).build();
        return new C0258f(new d(build));
    }

    @Override // X.InterfaceC0339g
    public Object c(InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        return ((InterfaceC0339g) this.f6486e).c(new C0408c(interfaceC1164c, null), interfaceC0617c);
    }

    @Override // P.InterfaceC0260h
    public boolean d(float f8) {
        if (f8 == 0.0f) {
            return false;
        }
        h();
        ((NestedScrollView) this.f6486e).j((int) f8);
        return true;
    }

    @Override // P.InterfaceC0255c
    public void e(Uri uri) {
        ((ContentInfo.Builder) this.f6486e).setLinkUri(uri);
    }

    @Override // P.InterfaceC0260h
    public float f() {
        return -((NestedScrollView) this.f6486e).getVerticalScrollFactorCompat();
    }

    @Override // X.InterfaceC0339g
    public InterfaceC0233f g() {
        return ((InterfaceC0339g) this.f6486e).g();
    }

    @Override // M0.a
    public View getRoot() {
        return (LinearLayout) this.f6486e;
    }

    @Override // P.InterfaceC0260h
    public void h() {
        ((NestedScrollView) this.f6486e).f8577g.abortAnimation();
    }

    @Override // P.InterfaceC0255c
    public void i(int i4) {
        ((ContentInfo.Builder) this.f6486e).setFlags(i4);
    }

    @Override // S2.i
    public void invalidate() {
        ((View) ((g) this.f6486e).f706a).invalidate();
    }

    public W5.a k(C0722b c0722b, C0587f c0587f) {
        H6.b q6;
        o6.j.e(c0722b, "classId");
        o6.j.e(c0587f, "metadataVersion");
        String Y = v.Y(c0722b.f10794b.f10797a.f10800a, '.', '$');
        C0723c c0723c = c0722b.f10793a;
        if (!c0723c.f10797a.c()) {
            Y = c0723c + '.' + Y;
        }
        Class L8 = AbstractC1492c.L((ClassLoader) this.f6486e, Y);
        if (L8 != null && (q6 = AbstractC1638C.q(L8)) != null) {
            return new W5.a(5, q6);
        }
        return null;
    }

    public File l(String str) {
        File file = new File(p(), j(str, b.f6480e, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(p(), j(str, b.f6481f, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(p(), j(str, b.f6482g, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public boolean n() {
        if (((AbstractC0948c) this.f6486e) == null) {
            return true;
        }
        return false;
    }

    public void o() {
        ((C0731A) this.f6486e).f10845l.R();
    }

    public File p() {
        File file = new File(((Context) ((B1.b) this.f6486e).f423e).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File q(String str, InputStream inputStream, b bVar) {
        File file = new File(p(), j(str, bVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // P.InterfaceC0255c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f6486e).setExtras(bundle);
    }

    public String toString() {
        switch (this.f6485d) {
            case 21:
                StringBuilder sb = new StringBuilder();
                q qVar = (q) this.f6486e;
                sb.append(qVar);
                sb.append(": ");
                sb.append(((Map) AbstractC0862a.j(qVar.f5881m, q.f5879q[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        switch (this.f6485d) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Object x8 = ((L) this.f6486e).x(new e(interfaceC0234g, 17), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x8;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 11:
            case 12:
            case 14:
            case 16:
            case 18:
            case 19:
            default:
                Object x9 = ((W5.a) this.f6486e).x(new X3.t(interfaceC0234g, 18), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x9;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                Object x10 = ((I) this.f6486e).x(new e(interfaceC0234g, 26), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x10;
            case 9:
                Object x11 = ((c) this.f6486e).x(new E(interfaceC0234g, 8), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x11;
            case 10:
                Object x12 = ((C0040p) this.f6486e).x(new E(interfaceC0234g, 15), interfaceC0617c);
                if (x12 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x12;
            case 13:
                Object x13 = ((C0040p) this.f6486e).x(new J(interfaceC0234g, 18), interfaceC0617c);
                if (x13 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x13;
            case 15:
                Object x14 = ((C4.e) this.f6486e).x(new J(interfaceC0234g, 23), interfaceC0617c);
                if (x14 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x14;
            case 17:
                Object x15 = ((C0040p) this.f6486e).x(new x(interfaceC0234g, 8), interfaceC0617c);
                if (x15 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x15;
            case 20:
                Object x16 = ((z) this.f6486e).x(new X3.t(interfaceC0234g, 7), interfaceC0617c);
                if (x16 != EnumC0646a.f10656d) {
                    return y.f7506a;
                }
                return x16;
        }
    }

    @Override // P.InterfaceC0268p
    public t0 y(View view, t0 t0Var) {
        boolean z8;
        p0 p0Var = t0Var.f4308a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f6486e;
        if (!Objects.equals(coordinatorLayout.f8545q, t0Var)) {
            coordinatorLayout.f8545q = t0Var;
            boolean z9 = true;
            if (t0Var.d() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            coordinatorLayout.f8546r = z8;
            if (z8 || coordinatorLayout.getBackground() != null) {
                z9 = false;
            }
            coordinatorLayout.setWillNotDraw(z9);
            if (!p0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    WeakHashMap weakHashMap = P.O.f4214a;
                    if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).f532a != null && p0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return t0Var;
    }

    public /* synthetic */ c(int i4, boolean z8) {
        this.f6485d = i4;
    }

    public c(LinearLayout linearLayout, p1 p1Var, A4.d dVar) {
        this.f6485d = 1;
        this.f6486e = linearLayout;
    }

    public c(EditText editText) {
        this.f6485d = 27;
        this.f6486e = new r(editText);
    }

    public c(int i4) {
        this.f6485d = i4;
        switch (i4) {
            case 19:
                this.f6486e = new AtomicInteger(0);
                return;
            default:
                this.f6486e = new HashSet();
                return;
        }
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f6485d = 14;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f6486e = new R.f(uri, clipDescription, uri2);
        } else {
            this.f6486e = new R.g(uri, clipDescription, uri2);
        }
    }

    public c(ClipData clipData, int i4) {
        this.f6485d = 11;
        this.f6486e = D5.e.h(clipData, i4);
    }
}
