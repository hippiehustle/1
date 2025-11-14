package c;

import a.AbstractC0405a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0508t;
import androidx.lifecycle.InterfaceC0510v;
import e.C0625a;
import e.C0628d;
import e.C0629e;
import e.C0630f;
import e.C0631g;
import e.C0632h;
import e.InterfaceC0626b;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import r6.AbstractC1470a;
import r6.AbstractC1473d;

/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9319a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9320b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9321c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f9322d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f9323e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f9324f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f9325g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0870i f9326h;

    public C0553g(AbstractActivityC0870i abstractActivityC0870i) {
        this.f9326h = abstractActivityC0870i;
    }

    public final boolean a(int i4, int i8, Intent intent) {
        String str = (String) this.f9319a.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        C0630f c0630f = (C0630f) this.f9323e.get(str);
        if (c0630f != null) {
            InterfaceC0626b interfaceC0626b = c0630f.f10567a;
            if (this.f9322d.contains(str)) {
                interfaceC0626b.h(c0630f.f10568b.i0(i8, intent));
                this.f9322d.remove(str);
                return true;
            }
        }
        this.f9324f.remove(str);
        this.f9325g.putParcelable(str, new C0625a(i8, intent));
        return true;
    }

    public final void b(int i4, AbstractC0405a abstractC0405a, Object obj) {
        Bundle bundle;
        int i8;
        String[] strArr;
        AbstractActivityC0870i abstractActivityC0870i = this.f9326h;
        W0.c Q5 = abstractC0405a.Q(abstractActivityC0870i, obj);
        if (Q5 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0552f(this, i4, Q5, 0));
            return;
        }
        Intent s8 = abstractC0405a.s(abstractActivityC0870i, obj);
        if (s8.getExtras() != null && s8.getExtras().getClassLoader() == null) {
            s8.setExtrasClassLoader(abstractActivityC0870i.getClassLoader());
        }
        if (s8.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = s8.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            s8.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(s8.getAction())) {
            String[] stringArrayExtra = s8.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i9 = 0; i9 < stringArrayExtra.length; i9++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i9])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i9], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i9));
                    }
                } else {
                    throw new IllegalArgumentException(A.j.r(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                    if (!hashSet.contains(Integer.valueOf(i11))) {
                        strArr[i10] = stringArrayExtra[i11];
                        i10++;
                    }
                }
            }
            abstractActivityC0870i.requestPermissions(stringArrayExtra, i4);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(s8.getAction())) {
            C0632h c0632h = (C0632h) s8.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i8 = i4;
                try {
                    abstractActivityC0870i.startIntentSenderForResult(c0632h.f10571d, i8, c0632h.f10572e, c0632h.f10573f, c0632h.f10574g, 0, bundle2);
                } catch (IntentSender.SendIntentException e9) {
                    e = e9;
                    new Handler(Looper.getMainLooper()).post(new RunnableC0552f(this, i8, e, 1));
                }
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i8 = i4;
            }
        } else {
            abstractActivityC0870i.startActivityForResult(s8, i4, bundle2);
        }
    }

    public final C0629e c(String str, AbstractC0405a abstractC0405a, InterfaceC0626b interfaceC0626b) {
        e(str);
        this.f9323e.put(str, new C0630f(abstractC0405a, interfaceC0626b));
        HashMap hashMap = this.f9324f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            interfaceC0626b.h(obj);
        }
        Bundle bundle = this.f9325g;
        C0625a c0625a = (C0625a) bundle.getParcelable(str);
        if (c0625a != null) {
            bundle.remove(str);
            interfaceC0626b.h(abstractC0405a.i0(c0625a.f10556d, c0625a.f10557e));
        }
        return new C0629e(this, str, abstractC0405a, 1);
    }

    public final C0629e d(String str, InterfaceC0510v interfaceC0510v, AbstractC0405a abstractC0405a, InterfaceC0626b interfaceC0626b) {
        C0512x g8 = interfaceC0510v.g();
        if (g8.f8862d.compareTo(EnumC0504o.f8849g) < 0) {
            e(str);
            HashMap hashMap = this.f9321c;
            C0631g c0631g = (C0631g) hashMap.get(str);
            if (c0631g == null) {
                c0631g = new C0631g(g8);
            }
            C0628d c0628d = new C0628d(this, str, interfaceC0626b, abstractC0405a, 0);
            c0631g.f10569a.a(c0628d);
            c0631g.f10570b.add(c0628d);
            hashMap.put(str, c0631g);
            return new C0629e(this, str, abstractC0405a, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + interfaceC0510v + " is attempting to register while current state is " + g8.f8862d + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final void e(String str) {
        HashMap hashMap = this.f9320b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        AbstractC1470a abstractC1470a = AbstractC1473d.f14417d;
        int nextInt = AbstractC1473d.f14417d.g().nextInt(2147418112);
        while (true) {
            int i4 = nextInt + 65536;
            Integer valueOf = Integer.valueOf(i4);
            HashMap hashMap2 = this.f9319a;
            if (hashMap2.containsKey(valueOf)) {
                AbstractC1470a abstractC1470a2 = AbstractC1473d.f14417d;
                nextInt = AbstractC1473d.f14417d.g().nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i4), str);
                hashMap.put(str, Integer.valueOf(i4));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f9322d.contains(str) && (num = (Integer) this.f9320b.remove(str)) != null) {
            this.f9319a.remove(num);
        }
        this.f9323e.remove(str);
        HashMap hashMap = this.f9324f;
        if (hashMap.containsKey(str)) {
            StringBuilder s8 = A.j.s("Dropping pending result for request ", str, ": ");
            s8.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", s8.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f9325g;
        if (bundle.containsKey(str)) {
            StringBuilder s9 = A.j.s("Dropping pending result for request ", str, ": ");
            s9.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", s9.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f9321c;
        C0631g c0631g = (C0631g) hashMap2.get(str);
        if (c0631g != null) {
            ArrayList arrayList = c0631g.f10570b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0631g.f10569a.f((InterfaceC0508t) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
