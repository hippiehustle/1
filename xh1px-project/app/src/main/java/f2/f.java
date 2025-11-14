package f2;

import android.content.ComponentName;
import g2.C0777a;
import java.util.Iterator;
import java.util.List;
import l1.C0999a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f10699a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f10700b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10701c;

    /* renamed from: d, reason: collision with root package name */
    public int f10702d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f10703e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10704f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10705g;

    /* renamed from: h, reason: collision with root package name */
    public final ComponentName f10706h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f10707i;
    public final List j;

    public f(C0999a c0999a, C0999a c0999a2, String str, int i4, Boolean bool, boolean z8, String str2, ComponentName componentName, Integer num, List list) {
        this.f10699a = c0999a;
        this.f10700b = c0999a2;
        this.f10701c = str;
        this.f10702d = i4;
        this.f10703e = bool;
        this.f10704f = z8;
        this.f10705g = str2;
        this.f10706h = componentName;
        this.f10707i = num;
        this.j = list;
    }

    public static f i(f fVar, C0999a c0999a, C0999a c0999a2, String str, int i4, Boolean bool, boolean z8, String str2, ComponentName componentName, Integer num, List list, int i8) {
        if ((i8 & 1) != 0) {
            c0999a = fVar.f10699a;
        }
        C0999a c0999a3 = c0999a;
        if ((i8 & 2) != 0) {
            c0999a2 = fVar.f10700b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i8 & 4) != 0) {
            str = fVar.f10701c;
        }
        String str3 = str;
        if ((i8 & 8) != 0) {
            i4 = fVar.f10702d;
        }
        int i9 = i4;
        Boolean bool2 = (i8 & 16) != 0 ? fVar.f10703e : bool;
        boolean z9 = (i8 & 32) != 0 ? fVar.f10704f : z8;
        String str4 = (i8 & 64) != 0 ? fVar.f10705g : str2;
        ComponentName componentName2 = (i8 & 128) != 0 ? fVar.f10706h : componentName;
        Integer num2 = (i8 & 256) != 0 ? fVar.f10707i : num;
        List list2 = (i8 & 512) != 0 ? fVar.j : list;
        fVar.getClass();
        return new f(c0999a3, c0999a4, str3, i9, bool2, z9, str4, componentName2, num2, list2);
    }

    @Override // m1.InterfaceC1054d
    public final int b() {
        return this.f10702d;
    }

    @Override // f2.a, m1.InterfaceC1051a
    public final boolean d() {
        if (super.d() && this.f10703e != null && this.f10705g != null && this.f10707i != null) {
            List list = this.j;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((C0777a) it.next()).d()) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1054d
    public final void e(int i4) {
        this.f10702d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (o6.j.a(this.f10699a, fVar.f10699a) && o6.j.a(this.f10700b, fVar.f10700b) && o6.j.a(this.f10701c, fVar.f10701c) && this.f10702d == fVar.f10702d && o6.j.a(this.f10703e, fVar.f10703e) && this.f10704f == fVar.f10704f && o6.j.a(this.f10705g, fVar.f10705g) && o6.j.a(this.f10706h, fVar.f10706h) && o6.j.a(this.f10707i, fVar.f10707i) && o6.j.a(this.j, fVar.j)) {
            return true;
        }
        return false;
    }

    @Override // f2.a
    public final C0999a f() {
        return this.f10700b;
    }

    @Override // f2.a
    public final String g() {
        return this.f10701c;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f10699a;
    }

    @Override // f2.a
    public final int h() {
        int i4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f10701c;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        Boolean bool = this.f10703e;
        if (bool != null) {
            i8 = bool.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode = Boolean.hashCode(this.f10704f) + i4 + i8;
        String str2 = this.f10705g;
        if (str2 != null) {
            i9 = str2.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = hashCode + i9;
        ComponentName componentName = this.f10706h;
        if (componentName != null) {
            i10 = componentName.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i13 + i10;
        Integer num = this.f10707i;
        if (num != null) {
            i11 = num.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = i14 + i11;
        List list = this.j;
        if (list != null) {
            i12 = list.hashCode();
        }
        return i15 + i12;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int d2 = A.j.d(this.f10700b, this.f10699a.hashCode() * 31, 31);
        int i4 = 0;
        String str = this.f10701c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b4 = AbstractC1149a.b(this.f10702d, (d2 + hashCode) * 31, 31);
        Boolean bool = this.f10703e;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int c6 = AbstractC1149a.c((b4 + hashCode2) * 31, 31, this.f10704f);
        String str2 = this.f10705g;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i8 = (c6 + hashCode3) * 31;
        ComponentName componentName = this.f10706h;
        if (componentName == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = componentName.hashCode();
        }
        int i9 = (i8 + hashCode4) * 31;
        Integer num = this.f10707i;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i10 = (i9 + hashCode5) * 31;
        List list = this.j;
        if (list != null) {
            i4 = list.hashCode();
        }
        return i10 + i4;
    }

    public final String toString() {
        int i4 = this.f10702d;
        StringBuilder t8 = A.j.t("Intent(id=", this.f10699a, ", eventId=", this.f10700b, ", name=");
        t8.append(this.f10701c);
        t8.append(", priority=");
        t8.append(i4);
        t8.append(", isAdvanced=");
        t8.append(this.f10703e);
        t8.append(", isBroadcast=");
        t8.append(this.f10704f);
        t8.append(", intentAction=");
        t8.append(this.f10705g);
        t8.append(", componentName=");
        t8.append(this.f10706h);
        t8.append(", flags=");
        t8.append(this.f10707i);
        t8.append(", extras=");
        t8.append(this.j);
        t8.append(")");
        return t8.toString();
    }
}
