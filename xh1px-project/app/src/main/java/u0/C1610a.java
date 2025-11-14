package u0;

import android.content.Context;
import android.content.Intent;
import d6.InterfaceC0622h;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1610a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15203a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15204b;

    /* renamed from: c, reason: collision with root package name */
    public final G5.e f15205c;

    /* renamed from: d, reason: collision with root package name */
    public final C1.a f15206d;

    /* renamed from: e, reason: collision with root package name */
    public final List f15207e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15208f;

    /* renamed from: g, reason: collision with root package name */
    public final t f15209g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f15210h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f15211i;
    public final Intent j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15212l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f15213m;

    /* renamed from: n, reason: collision with root package name */
    public final String f15214n;

    /* renamed from: o, reason: collision with root package name */
    public final File f15215o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f15216p;

    /* renamed from: q, reason: collision with root package name */
    public final List f15217q;

    /* renamed from: r, reason: collision with root package name */
    public final List f15218r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f15219s;

    /* renamed from: t, reason: collision with root package name */
    public final D0.b f15220t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0622h f15221u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15222v;

    public C1610a(Context context, String str, G5.e eVar, C1.a aVar, List list, boolean z8, t tVar, Executor executor, Executor executor2, Intent intent, boolean z9, boolean z10, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z11, D0.b bVar, InterfaceC0622h interfaceC0622h) {
        o6.j.e(context, "context");
        o6.j.e(aVar, "migrationContainer");
        o6.j.e(executor, "queryExecutor");
        o6.j.e(executor2, "transactionExecutor");
        o6.j.e(list2, "typeConverters");
        o6.j.e(list3, "autoMigrationSpecs");
        this.f15203a = context;
        this.f15204b = str;
        this.f15205c = eVar;
        this.f15206d = aVar;
        this.f15207e = list;
        this.f15208f = z8;
        this.f15209g = tVar;
        this.f15210h = executor;
        this.f15211i = executor2;
        this.j = intent;
        this.k = z9;
        this.f15212l = z10;
        this.f15213m = set;
        this.f15214n = str2;
        this.f15215o = file;
        this.f15216p = callable;
        this.f15217q = list2;
        this.f15218r = list3;
        this.f15219s = z11;
        this.f15220t = bVar;
        this.f15221u = interfaceC0622h;
        this.f15222v = true;
    }
}
