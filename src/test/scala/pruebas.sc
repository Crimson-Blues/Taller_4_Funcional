import SubsecuenciaMasLarga ._

subindices(2,3)
subindices(0,3)

val s = Seq( 20, 30, 10, 40,  15, 16, 17)
val s1= Seq( 20, 30, 10)
val s2 = Seq(20, 30, 10, 40, 15, 16, 17, 11, 12, 13, 14)
val s3 = Seq()

subSecuenciaAsoc(s, Seq())
subSecuenciaAsoc(s, Seq(0,2,4))
subSecuenciaAsoc(s, Seq(1,2,4,6))

subSecuenciasDe(s1)

incremental(Seq(10, 15, 16, 17))
incremental(Seq(30, 10, 40))
incremental(Seq(20, 10))
incremental(Seq(20,20))
incremental(Seq(10))
incremental(Seq())

subSecuenciasInc(s)
subSecuenciasInc(s1)

subsecuenciaIncrementalMasLarga(s)
subsecuenciaIncrementalMasLarga(s1)
subsecuenciaIncrementalMasLarga(s2)
subsecuenciaIncrementalMasLarga(s3)