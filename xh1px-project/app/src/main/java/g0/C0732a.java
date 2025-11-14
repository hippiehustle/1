package g0;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732a implements O {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10951a;

    /* renamed from: b, reason: collision with root package name */
    public int f10952b;

    /* renamed from: c, reason: collision with root package name */
    public int f10953c;

    /* renamed from: d, reason: collision with root package name */
    public int f10954d;

    /* renamed from: e, reason: collision with root package name */
    public int f10955e;

    /* renamed from: f, reason: collision with root package name */
    public int f10956f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10957g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10958h;

    /* renamed from: i, reason: collision with root package name */
    public String f10959i;
    public int j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public int f10960l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f10961m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f10962n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f10963o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10964p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f10965q;

    /* renamed from: r, reason: collision with root package name */
    public final T f10966r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10967s;

    /* renamed from: t, reason: collision with root package name */
    public int f10968t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10969u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0732a(T t8) {
        this();
        t8.I();
        C0731A c0731a = t8.f10921x;
        if (c0731a != null) {
            c0731a.j.getClassLoader();
        }
        this.f10968t = -1;
        this.f10969u = false;
        this.f10966r = t8;
    }

    @Override // g0.O
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (T.K(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f10957g) {
            this.f10966r.f10903d.add(this);
            return true;
        }
        return true;
    }

    public final void b(c0 c0Var) {
        this.f10951a.add(c0Var);
        c0Var.f10996d = this.f10952b;
        c0Var.f10997e = this.f10953c;
        c0Var.f10998f = this.f10954d;
        c0Var.f10999g = this.f10955e;
    }

    public final void c(int i4) {
        if (this.f10957g) {
            if (T.K(2)) {
                toString();
            }
            ArrayList arrayList = this.f10951a;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                c0 c0Var = (c0) arrayList.get(i8);
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = c0Var.f10994b;
                if (abstractComponentCallbacksC0755y != null) {
                    abstractComponentCallbacksC0755y.f11127w += i4;
                    if (T.K(2)) {
                        Objects.toString(c0Var.f10994b);
                        int i9 = c0Var.f10994b.f11127w;
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f10951a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            c0 c0Var = (c0) arrayList.get(size);
            if (c0Var.f10995c) {
                if (c0Var.f10993a == 8) {
                    c0Var.f10995c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i4 = c0Var.f10994b.f11087C;
                    c0Var.f10993a = 2;
                    c0Var.f10995c = false;
                    for (int i8 = size - 1; i8 >= 0; i8--) {
                        c0 c0Var2 = (c0) arrayList.get(i8);
                        if (c0Var2.f10995c && c0Var2.f10994b.f11087C == i4) {
                            arrayList.remove(i8);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void e() {
        f(false, true);
    }

    public final int f(boolean z8, boolean z9) {
        if (!this.f10967s) {
            if (T.K(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new e0());
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.f10967s = true;
            boolean z10 = this.f10957g;
            T t8 = this.f10966r;
            if (z10) {
                this.f10968t = t8.k.getAndIncrement();
            } else {
                this.f10968t = -1;
            }
            if (z9) {
                t8.y(this, z8);
            }
            return this.f10968t;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void g(int i4, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, String str, int i8) {
        String str2 = abstractComponentCallbacksC0755y.f11101R;
        if (str2 != null) {
            h0.c.c(abstractComponentCallbacksC0755y, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0755y.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = abstractComponentCallbacksC0755y.f11088D;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0755y + ": was " + abstractComponentCallbacksC0755y.f11088D + " now " + str);
                }
                abstractComponentCallbacksC0755y.f11088D = str;
            }
            if (i4 != 0) {
                if (i4 != -1) {
                    int i9 = abstractComponentCallbacksC0755y.f11086B;
                    if (i9 != 0 && i9 != i4) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0755y + ": was " + abstractComponentCallbacksC0755y.f11086B + " now " + i4);
                    }
                    abstractComponentCallbacksC0755y.f11086B = i4;
                    abstractComponentCallbacksC0755y.f11087C = i4;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0755y + " with tag " + str + " to container view with no id");
                }
            }
            b(new c0(i8, abstractComponentCallbacksC0755y));
            abstractComponentCallbacksC0755y.f11128x = this.f10966r;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void h(String str, PrintWriter printWriter, boolean z8) {
        String str2;
        if (z8) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f10959i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f10968t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f10967s);
            if (this.f10956f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f10956f));
            }
            if (this.f10952b != 0 || this.f10953c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10952b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10953c));
            }
            if (this.f10954d != 0 || this.f10955e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10954d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10955e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.f10960l != 0 || this.f10961m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10960l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f10961m);
            }
        }
        ArrayList arrayList = this.f10951a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                c0 c0Var = (c0) arrayList.get(i4);
                switch (c0Var.f10993a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        str2 = "REPLACE";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        str2 = "REMOVE";
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        str2 = "HIDE";
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        str2 = "SHOW";
                        break;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        str2 = "DETACH";
                        break;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        str2 = "ATTACH";
                        break;
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + c0Var.f10993a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0Var.f10994b);
                if (z8) {
                    if (c0Var.f10996d != 0 || c0Var.f10997e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0Var.f10996d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0Var.f10997e));
                    }
                    if (c0Var.f10998f != 0 || c0Var.f10999g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0Var.f10998f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0Var.f10999g));
                    }
                }
            }
        }
    }

    public final void i(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        T t8 = abstractComponentCallbacksC0755y.f11128x;
        if (t8 != null && t8 != this.f10966r) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0755y.toString() + " is already attached to a FragmentManager.");
        }
        b(new c0(8, abstractComponentCallbacksC0755y));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f10968t >= 0) {
            sb.append(" #");
            sb.append(this.f10968t);
        }
        if (this.f10959i != null) {
            sb.append(" ");
            sb.append(this.f10959i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v0, types: [g0.c0, java.lang.Object] */
    public C0732a(C0732a c0732a) {
        this();
        c0732a.f10966r.I();
        C0731A c0731a = c0732a.f10966r.f10921x;
        if (c0731a != null) {
            c0731a.j.getClassLoader();
        }
        Iterator it = c0732a.f10951a.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            ArrayList arrayList = this.f10951a;
            ?? obj = new Object();
            obj.f10993a = c0Var.f10993a;
            obj.f10994b = c0Var.f10994b;
            obj.f10995c = c0Var.f10995c;
            obj.f10996d = c0Var.f10996d;
            obj.f10997e = c0Var.f10997e;
            obj.f10998f = c0Var.f10998f;
            obj.f10999g = c0Var.f10999g;
            obj.f11000h = c0Var.f11000h;
            obj.f11001i = c0Var.f11001i;
            arrayList.add(obj);
        }
        this.f10952b = c0732a.f10952b;
        this.f10953c = c0732a.f10953c;
        this.f10954d = c0732a.f10954d;
        this.f10955e = c0732a.f10955e;
        this.f10956f = c0732a.f10956f;
        this.f10957g = c0732a.f10957g;
        this.f10958h = c0732a.f10958h;
        this.f10959i = c0732a.f10959i;
        this.f10960l = c0732a.f10960l;
        this.f10961m = c0732a.f10961m;
        this.j = c0732a.j;
        this.k = c0732a.k;
        if (c0732a.f10962n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f10962n = arrayList2;
            arrayList2.addAll(c0732a.f10962n);
        }
        if (c0732a.f10963o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f10963o = arrayList3;
            arrayList3.addAll(c0732a.f10963o);
        }
        this.f10964p = c0732a.f10964p;
        this.f10968t = -1;
        this.f10969u = false;
        this.f10966r = c0732a.f10966r;
        this.f10967s = c0732a.f10967s;
        this.f10968t = c0732a.f10968t;
        this.f10969u = c0732a.f10969u;
    }

    public C0732a() {
        this.f10951a = new ArrayList();
        this.f10958h = true;
        this.f10964p = false;
    }
}
